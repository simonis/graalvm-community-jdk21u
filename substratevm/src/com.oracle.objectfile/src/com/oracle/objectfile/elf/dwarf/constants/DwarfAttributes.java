/*
 * Copyright (c) 2023, 2023, Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2023, 2023, Red Hat Inc. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.oracle.objectfile.elf.dwarf.constants;

/**
 * All the Dwarf attributes needed to populate DIEs generated by GraalVM.
 */
public interface DwarfAttributes {
    int DW_AT_null = 0x0;
    int DW_AT_location = 0x02;
    int DW_AT_name = 0x3;
    int DW_AT_byte_size = 0x0b;
    int DW_AT_bit_size = 0x0d;
    int DW_AT_stmt_list = 0x10;
    int DW_AT_low_pc = 0x11;
    int DW_AT_hi_pc = 0x12;
    int DW_AT_language = 0x13;
    int DW_AT_comp_dir = 0x1b;
    int DW_AT_containing_type = 0x1d;
    int DW_AT_inline = 0x20;
    int DW_AT_abstract_origin = 0x31;
    int DW_AT_accessibility = 0x32;
    int DW_AT_artificial = 0x34;
    int DW_AT_count = 0x37;
    int DW_AT_data_member_location = 0x38;
    @SuppressWarnings("unused") int DW_AT_decl_column = 0x39;
    int DW_AT_decl_file = 0x3a;
    int DW_AT_decl_line = 0x3b;
    int DW_AT_declaration = 0x3c;
    int DW_AT_encoding = 0x3e;
    int DW_AT_external = 0x3f;
    @SuppressWarnings("unused") int DW_AT_return_addr = 0x2a;
    @SuppressWarnings("unused") int DW_AT_frame_base = 0x40;
    int DW_AT_specification = 0x47;
    int DW_AT_type = 0x49;
    int DW_AT_data_location = 0x50;
    int DW_AT_use_UTF8 = 0x53;
    int DW_AT_ranges = 0x55;
    int DW_AT_call_file = 0x58;
    int DW_AT_call_line = 0x59;
    int DW_AT_object_pointer = 0x64;
    int DW_AT_linkage_name = 0x6e;
}
