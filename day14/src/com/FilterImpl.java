package com;

import java.io.File;
import java.io.FileFilter;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class FilterImpl implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return true;
    }
}
