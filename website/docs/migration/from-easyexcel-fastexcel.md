---
sidebar_position: 1
title: From EasyExcel/FastExcel
description: Complete migration guide for transitioning from Alibaba EasyExcel or cn.idev FastExcel to Apache Fesod
keywords: [fesod, migration, easyexcel, fastexcel, apache, excel, upgrade]
---

# Migration Guide: EasyExcel and FastExcel to Apache Fesod

## Overview

This guide provides a comprehensive roadmap for migrating applications from Alibaba EasyExcel or cn.idev FastExcel libraries to Apache Fesod. Apache Fesod is the evolution of these projects, now under the Apache Software Foundation (Incubating), offering the same high-performance Excel processing capabilities with enhanced community support and long-term sustainability.

### Why Migrate?

- **Apache Foundation Support**: Apache Fesod is now part of the Apache Software Foundation, ensuring long-term maintenance and community-driven development
- **Seamless Transition**: The API remains virtually identical, requiring minimal code changes
- **Enhanced Branding**: Unified naming conventions under the Apache Fesod umbrella
- **Continued Innovation**: Access to future enhancements and features under active Apache governance
- **Backward Compatibility**: Deprecated aliases (EasyExcel, FastExcel) are temporarily maintained for gradual migration

### Migration Scope

This migration primarily involves:

1. Updating Maven/Gradle dependencies
2. Replacing deprecated class names with FesodSheet
3. Updating package imports
4. Verifying functionality through comprehensive testing

The core API, annotations, and processing logic remain unchanged, ensuring a low-risk migration path.

---

## Migration Steps

### Step 1: Update Dependencies

Replace your existing dependency with Apache Fesod:

| Source | GroupId | ArtifactId | Version |
|--------|---------|------------|----------|
| **Alibaba EasyExcel** | com.alibaba | easyexcel | 4.0.3 |
| **cn.idev FastExcel** | cn.idev.excel | fastexcel | 1.3.0 |
| **Apache Fesod** ✅ | org.apache.fesod | fesod | 1.3.0+ |

**Maven:**
```xml
<dependency>
    <groupId>org.apache.fesod</groupId>
    <artifactId>fesod</artifactId>
    <version>1.3.0</version>
</dependency>
```

**Gradle:**
```gradle
implementation 'org.apache.fesod:fesod:1.3.0'
```

### Step 2: Package Import Updates

Update all import statements to use the new Apache Fesod package structure.

| Old Package (Deprecated) | New Package (Required) |
|--------------------------|------------------------|
| com.alibaba.excel.* | org.apache.fesod.sheet.* |
| cn.idev.excel.* | org.apache.fesod.sheet.* |

**Common Import Replacements:**

| Before | After |
|--------|-------|
| import com.alibaba.excel.EasyExcel; | import org.apache.fesod.sheet.FesodSheet; |
| import com.alibaba.excel.ExcelReader; | import org.apache.fesod.sheet.ExcelReader; |
| import com.alibaba.excel.ExcelWriter; | import org.apache.fesod.sheet.ExcelWriter; |
| import com.alibaba.excel.annotation.ExcelProperty; | import org.apache.fesod.sheet.annotation.ExcelProperty; |
| import com.alibaba.excel.context.AnalysisContext; | import org.apache.fesod.sheet.context.AnalysisContext; |
| import com.alibaba.excel.read.listener.ReadListener; | import org.apache.fesod.sheet.read.listener.ReadListener; |
| import cn.idev.excel.FastExcel; | import org.apache.fesod.sheet.FesodSheet; |
| import cn.idev.excel.FastExcelFactory; | import org.apache.fesod.sheet.FesodSheet; |

### Step 3: Class Name Migration

Replace deprecated entry point classes with FesodSheet.

#### Migration from EasyExcel

| Operation | Before (EasyExcel) | After (FesodSheet) |
|-----------|-------------------|-------------------|
| **Simple Read** | EasyExcel.read(file, Data.class, listener) | FesodSheet.read(file, Data.class, listener) |
| **Simple Write** | EasyExcel.write(file, Data.class) | FesodSheet.write(file, Data.class) |
| **Read Sheet** | EasyExcel.readSheet(0) | FesodSheet.readSheet(0) |
| **Write Sheet** | EasyExcel.writerSheet("Sheet1") | FesodSheet.writerSheet("Sheet1") |
| **Read Builder** | EasyExcel.read(stream) | FesodSheet.read(stream) |
| **Write Builder** | EasyExcel.write(stream) | FesodSheet.write(stream) |

#### Migration from FastExcel/FastExcelFactory

| Operation | Before (FastExcel) | After (FesodSheet) |
|-----------|-------------------|-------------------|
| **Simple Read** | FastExcel.read(file, Data.class, listener) | FesodSheet.read(file, Data.class, listener) |
| **Simple Write** | FastExcel.write(file, Data.class) | FesodSheet.write(file, Data.class) |
| **Read Sheet** | FastExcelFactory.readSheet(0) | FesodSheet.readSheet(0) |
| **Write Sheet** | FastExcelFactory.writerSheet("Sheet1") | FesodSheet.writerSheet("Sheet1") |
| **Read with Stream** | FastExcel.read(inputStream) | FesodSheet.read(inputStream) |
| **Write with Stream** | FastExcel.write(outputStream) | FesodSheet.write(outputStream) |

---

## Migration Strategies

### Gradual Migration (Recommended)

Utilize the deprecated alias classes for a phased migration approach.

**Phase 1: Dependency Update Only**
- Update Maven/Gradle dependency to Apache Fesod
- Keep using EasyExcel or FastExcel classes (now deprecated aliases)
- Update package imports only
- Run comprehensive tests to verify compatibility

**Phase 2: Class Name Migration**
- Progressively replace deprecated classes with FesodSheet
- Use IDE refactoring tools for bulk renaming
- Migrate module by module or feature by feature
- Maintain thorough test coverage throughout

**Phase 3: Cleanup**
- Remove all references to deprecated classes
- Resolve deprecation warnings
- Update documentation and code comments

**Benefits:**
- Lower risk through incremental changes
- Easier rollback if issues arise
- Minimal disruption to ongoing development
- Allows time for thorough testing at each phase

---

## Conclusion

Migrating from Alibaba EasyExcel or cn.idev FastExcel to Apache Fesod is a straightforward process due to the high degree of API compatibility and backward-compatible deprecated aliases. The primary effort involves updating dependency declarations and package imports, with minimal to no logic changes required.

The gradual migration strategy, supported by the temporary deprecated aliases (EasyExcel, FastExcel, FastExcelFactory), allows teams to migrate at their own pace while maintaining full functionality.

By following this guide, organizations can seamlessly transition to Apache Fesod and benefit from the long-term sustainability and community support of the Apache Software Foundation ecosystem.
