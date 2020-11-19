package com.mycompany.nifi;

import org.apache.nifi.avro.AvroTypeUtil;
import org.apache.nifi.serialization.record.RecordSchema;

public class ScriptUtil {
    public static final RecordSchema SCHEMA;

    static {
        SCHEMA = AvroTypeUtil.createSchema(com.mycompany.nifi.SplitUserRecord.SCHEMA$);
    }
}
