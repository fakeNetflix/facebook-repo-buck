/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)")
public class BuildModeInfo implements org.apache.thrift.TBase<BuildModeInfo, BuildModeInfo._Fields>, java.io.Serializable, Cloneable, Comparable<BuildModeInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildModeInfo");

  private static final org.apache.thrift.protocol.TField MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("mode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TOTAL_NUMBER_OF_MINIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("totalNumberOfMinions", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField COORDINATOR_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("coordinatorAddress", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COORDINATOR_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("coordinatorPort", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField MINION_REQUIREMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("minionRequirements", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuildModeInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuildModeInfoTupleSchemeFactory();

  /**
   * 
   * @see BuildMode
   */
  public @org.apache.thrift.annotation.Nullable BuildMode mode; // optional
  public int totalNumberOfMinions; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String coordinatorAddress; // optional
  public int coordinatorPort; // optional
  public @org.apache.thrift.annotation.Nullable MinionRequirements minionRequirements; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see BuildMode
     */
    MODE((short)1, "mode"),
    TOTAL_NUMBER_OF_MINIONS((short)2, "totalNumberOfMinions"),
    COORDINATOR_ADDRESS((short)3, "coordinatorAddress"),
    COORDINATOR_PORT((short)4, "coordinatorPort"),
    MINION_REQUIREMENTS((short)5, "minionRequirements");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // MODE
          return MODE;
        case 2: // TOTAL_NUMBER_OF_MINIONS
          return TOTAL_NUMBER_OF_MINIONS;
        case 3: // COORDINATOR_ADDRESS
          return COORDINATOR_ADDRESS;
        case 4: // COORDINATOR_PORT
          return COORDINATOR_PORT;
        case 5: // MINION_REQUIREMENTS
          return MINION_REQUIREMENTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOTALNUMBEROFMINIONS_ISSET_ID = 0;
  private static final int __COORDINATORPORT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MODE,_Fields.TOTAL_NUMBER_OF_MINIONS,_Fields.COORDINATOR_ADDRESS,_Fields.COORDINATOR_PORT,_Fields.MINION_REQUIREMENTS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MODE, new org.apache.thrift.meta_data.FieldMetaData("mode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuildMode.class)));
    tmpMap.put(_Fields.TOTAL_NUMBER_OF_MINIONS, new org.apache.thrift.meta_data.FieldMetaData("totalNumberOfMinions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COORDINATOR_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("coordinatorAddress", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COORDINATOR_PORT, new org.apache.thrift.meta_data.FieldMetaData("coordinatorPort", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MINION_REQUIREMENTS, new org.apache.thrift.meta_data.FieldMetaData("minionRequirements", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MinionRequirements.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildModeInfo.class, metaDataMap);
  }

  public BuildModeInfo() {
    this.mode = com.facebook.buck.distributed.thrift.BuildMode.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildModeInfo(BuildModeInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMode()) {
      this.mode = other.mode;
    }
    this.totalNumberOfMinions = other.totalNumberOfMinions;
    if (other.isSetCoordinatorAddress()) {
      this.coordinatorAddress = other.coordinatorAddress;
    }
    this.coordinatorPort = other.coordinatorPort;
    if (other.isSetMinionRequirements()) {
      this.minionRequirements = new MinionRequirements(other.minionRequirements);
    }
  }

  public BuildModeInfo deepCopy() {
    return new BuildModeInfo(this);
  }

  @Override
  public void clear() {
    this.mode = com.facebook.buck.distributed.thrift.BuildMode.UNKNOWN;

    setTotalNumberOfMinionsIsSet(false);
    this.totalNumberOfMinions = 0;
    this.coordinatorAddress = null;
    setCoordinatorPortIsSet(false);
    this.coordinatorPort = 0;
    this.minionRequirements = null;
  }

  /**
   * 
   * @see BuildMode
   */
  @org.apache.thrift.annotation.Nullable
  public BuildMode getMode() {
    return this.mode;
  }

  /**
   * 
   * @see BuildMode
   */
  public BuildModeInfo setMode(@org.apache.thrift.annotation.Nullable BuildMode mode) {
    this.mode = mode;
    return this;
  }

  public void unsetMode() {
    this.mode = null;
  }

  /** Returns true if field mode is set (has been assigned a value) and false otherwise */
  public boolean isSetMode() {
    return this.mode != null;
  }

  public void setModeIsSet(boolean value) {
    if (!value) {
      this.mode = null;
    }
  }

  public int getTotalNumberOfMinions() {
    return this.totalNumberOfMinions;
  }

  public BuildModeInfo setTotalNumberOfMinions(int totalNumberOfMinions) {
    this.totalNumberOfMinions = totalNumberOfMinions;
    setTotalNumberOfMinionsIsSet(true);
    return this;
  }

  public void unsetTotalNumberOfMinions() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALNUMBEROFMINIONS_ISSET_ID);
  }

  /** Returns true if field totalNumberOfMinions is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalNumberOfMinions() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALNUMBEROFMINIONS_ISSET_ID);
  }

  public void setTotalNumberOfMinionsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALNUMBEROFMINIONS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCoordinatorAddress() {
    return this.coordinatorAddress;
  }

  public BuildModeInfo setCoordinatorAddress(@org.apache.thrift.annotation.Nullable java.lang.String coordinatorAddress) {
    this.coordinatorAddress = coordinatorAddress;
    return this;
  }

  public void unsetCoordinatorAddress() {
    this.coordinatorAddress = null;
  }

  /** Returns true if field coordinatorAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetCoordinatorAddress() {
    return this.coordinatorAddress != null;
  }

  public void setCoordinatorAddressIsSet(boolean value) {
    if (!value) {
      this.coordinatorAddress = null;
    }
  }

  public int getCoordinatorPort() {
    return this.coordinatorPort;
  }

  public BuildModeInfo setCoordinatorPort(int coordinatorPort) {
    this.coordinatorPort = coordinatorPort;
    setCoordinatorPortIsSet(true);
    return this;
  }

  public void unsetCoordinatorPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COORDINATORPORT_ISSET_ID);
  }

  /** Returns true if field coordinatorPort is set (has been assigned a value) and false otherwise */
  public boolean isSetCoordinatorPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COORDINATORPORT_ISSET_ID);
  }

  public void setCoordinatorPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COORDINATORPORT_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public MinionRequirements getMinionRequirements() {
    return this.minionRequirements;
  }

  public BuildModeInfo setMinionRequirements(@org.apache.thrift.annotation.Nullable MinionRequirements minionRequirements) {
    this.minionRequirements = minionRequirements;
    return this;
  }

  public void unsetMinionRequirements() {
    this.minionRequirements = null;
  }

  /** Returns true if field minionRequirements is set (has been assigned a value) and false otherwise */
  public boolean isSetMinionRequirements() {
    return this.minionRequirements != null;
  }

  public void setMinionRequirementsIsSet(boolean value) {
    if (!value) {
      this.minionRequirements = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case MODE:
      if (value == null) {
        unsetMode();
      } else {
        setMode((BuildMode)value);
      }
      break;

    case TOTAL_NUMBER_OF_MINIONS:
      if (value == null) {
        unsetTotalNumberOfMinions();
      } else {
        setTotalNumberOfMinions((java.lang.Integer)value);
      }
      break;

    case COORDINATOR_ADDRESS:
      if (value == null) {
        unsetCoordinatorAddress();
      } else {
        setCoordinatorAddress((java.lang.String)value);
      }
      break;

    case COORDINATOR_PORT:
      if (value == null) {
        unsetCoordinatorPort();
      } else {
        setCoordinatorPort((java.lang.Integer)value);
      }
      break;

    case MINION_REQUIREMENTS:
      if (value == null) {
        unsetMinionRequirements();
      } else {
        setMinionRequirements((MinionRequirements)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MODE:
      return getMode();

    case TOTAL_NUMBER_OF_MINIONS:
      return getTotalNumberOfMinions();

    case COORDINATOR_ADDRESS:
      return getCoordinatorAddress();

    case COORDINATOR_PORT:
      return getCoordinatorPort();

    case MINION_REQUIREMENTS:
      return getMinionRequirements();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MODE:
      return isSetMode();
    case TOTAL_NUMBER_OF_MINIONS:
      return isSetTotalNumberOfMinions();
    case COORDINATOR_ADDRESS:
      return isSetCoordinatorAddress();
    case COORDINATOR_PORT:
      return isSetCoordinatorPort();
    case MINION_REQUIREMENTS:
      return isSetMinionRequirements();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildModeInfo)
      return this.equals((BuildModeInfo)that);
    return false;
  }

  public boolean equals(BuildModeInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mode = true && this.isSetMode();
    boolean that_present_mode = true && that.isSetMode();
    if (this_present_mode || that_present_mode) {
      if (!(this_present_mode && that_present_mode))
        return false;
      if (!this.mode.equals(that.mode))
        return false;
    }

    boolean this_present_totalNumberOfMinions = true && this.isSetTotalNumberOfMinions();
    boolean that_present_totalNumberOfMinions = true && that.isSetTotalNumberOfMinions();
    if (this_present_totalNumberOfMinions || that_present_totalNumberOfMinions) {
      if (!(this_present_totalNumberOfMinions && that_present_totalNumberOfMinions))
        return false;
      if (this.totalNumberOfMinions != that.totalNumberOfMinions)
        return false;
    }

    boolean this_present_coordinatorAddress = true && this.isSetCoordinatorAddress();
    boolean that_present_coordinatorAddress = true && that.isSetCoordinatorAddress();
    if (this_present_coordinatorAddress || that_present_coordinatorAddress) {
      if (!(this_present_coordinatorAddress && that_present_coordinatorAddress))
        return false;
      if (!this.coordinatorAddress.equals(that.coordinatorAddress))
        return false;
    }

    boolean this_present_coordinatorPort = true && this.isSetCoordinatorPort();
    boolean that_present_coordinatorPort = true && that.isSetCoordinatorPort();
    if (this_present_coordinatorPort || that_present_coordinatorPort) {
      if (!(this_present_coordinatorPort && that_present_coordinatorPort))
        return false;
      if (this.coordinatorPort != that.coordinatorPort)
        return false;
    }

    boolean this_present_minionRequirements = true && this.isSetMinionRequirements();
    boolean that_present_minionRequirements = true && that.isSetMinionRequirements();
    if (this_present_minionRequirements || that_present_minionRequirements) {
      if (!(this_present_minionRequirements && that_present_minionRequirements))
        return false;
      if (!this.minionRequirements.equals(that.minionRequirements))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMode()) ? 131071 : 524287);
    if (isSetMode())
      hashCode = hashCode * 8191 + mode.getValue();

    hashCode = hashCode * 8191 + ((isSetTotalNumberOfMinions()) ? 131071 : 524287);
    if (isSetTotalNumberOfMinions())
      hashCode = hashCode * 8191 + totalNumberOfMinions;

    hashCode = hashCode * 8191 + ((isSetCoordinatorAddress()) ? 131071 : 524287);
    if (isSetCoordinatorAddress())
      hashCode = hashCode * 8191 + coordinatorAddress.hashCode();

    hashCode = hashCode * 8191 + ((isSetCoordinatorPort()) ? 131071 : 524287);
    if (isSetCoordinatorPort())
      hashCode = hashCode * 8191 + coordinatorPort;

    hashCode = hashCode * 8191 + ((isSetMinionRequirements()) ? 131071 : 524287);
    if (isSetMinionRequirements())
      hashCode = hashCode * 8191 + minionRequirements.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BuildModeInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMode()).compareTo(other.isSetMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mode, other.mode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTotalNumberOfMinions()).compareTo(other.isSetTotalNumberOfMinions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalNumberOfMinions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalNumberOfMinions, other.totalNumberOfMinions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCoordinatorAddress()).compareTo(other.isSetCoordinatorAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoordinatorAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coordinatorAddress, other.coordinatorAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCoordinatorPort()).compareTo(other.isSetCoordinatorPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoordinatorPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coordinatorPort, other.coordinatorPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMinionRequirements()).compareTo(other.isSetMinionRequirements());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinionRequirements()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minionRequirements, other.minionRequirements);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuildModeInfo(");
    boolean first = true;

    if (isSetMode()) {
      sb.append("mode:");
      if (this.mode == null) {
        sb.append("null");
      } else {
        sb.append(this.mode);
      }
      first = false;
    }
    if (isSetTotalNumberOfMinions()) {
      if (!first) sb.append(", ");
      sb.append("totalNumberOfMinions:");
      sb.append(this.totalNumberOfMinions);
      first = false;
    }
    if (isSetCoordinatorAddress()) {
      if (!first) sb.append(", ");
      sb.append("coordinatorAddress:");
      if (this.coordinatorAddress == null) {
        sb.append("null");
      } else {
        sb.append(this.coordinatorAddress);
      }
      first = false;
    }
    if (isSetCoordinatorPort()) {
      if (!first) sb.append(", ");
      sb.append("coordinatorPort:");
      sb.append(this.coordinatorPort);
      first = false;
    }
    if (isSetMinionRequirements()) {
      if (!first) sb.append(", ");
      sb.append("minionRequirements:");
      if (this.minionRequirements == null) {
        sb.append("null");
      } else {
        sb.append(this.minionRequirements);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (minionRequirements != null) {
      minionRequirements.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildModeInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildModeInfoStandardScheme getScheme() {
      return new BuildModeInfoStandardScheme();
    }
  }

  private static class BuildModeInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuildModeInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildModeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mode = com.facebook.buck.distributed.thrift.BuildMode.findByValue(iprot.readI32());
              struct.setModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOTAL_NUMBER_OF_MINIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalNumberOfMinions = iprot.readI32();
              struct.setTotalNumberOfMinionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COORDINATOR_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.coordinatorAddress = iprot.readString();
              struct.setCoordinatorAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COORDINATOR_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.coordinatorPort = iprot.readI32();
              struct.setCoordinatorPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MINION_REQUIREMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.minionRequirements = new MinionRequirements();
              struct.minionRequirements.read(iprot);
              struct.setMinionRequirementsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildModeInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mode != null) {
        if (struct.isSetMode()) {
          oprot.writeFieldBegin(MODE_FIELD_DESC);
          oprot.writeI32(struct.mode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTotalNumberOfMinions()) {
        oprot.writeFieldBegin(TOTAL_NUMBER_OF_MINIONS_FIELD_DESC);
        oprot.writeI32(struct.totalNumberOfMinions);
        oprot.writeFieldEnd();
      }
      if (struct.coordinatorAddress != null) {
        if (struct.isSetCoordinatorAddress()) {
          oprot.writeFieldBegin(COORDINATOR_ADDRESS_FIELD_DESC);
          oprot.writeString(struct.coordinatorAddress);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetCoordinatorPort()) {
        oprot.writeFieldBegin(COORDINATOR_PORT_FIELD_DESC);
        oprot.writeI32(struct.coordinatorPort);
        oprot.writeFieldEnd();
      }
      if (struct.minionRequirements != null) {
        if (struct.isSetMinionRequirements()) {
          oprot.writeFieldBegin(MINION_REQUIREMENTS_FIELD_DESC);
          struct.minionRequirements.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildModeInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildModeInfoTupleScheme getScheme() {
      return new BuildModeInfoTupleScheme();
    }
  }

  private static class BuildModeInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuildModeInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildModeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMode()) {
        optionals.set(0);
      }
      if (struct.isSetTotalNumberOfMinions()) {
        optionals.set(1);
      }
      if (struct.isSetCoordinatorAddress()) {
        optionals.set(2);
      }
      if (struct.isSetCoordinatorPort()) {
        optionals.set(3);
      }
      if (struct.isSetMinionRequirements()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMode()) {
        oprot.writeI32(struct.mode.getValue());
      }
      if (struct.isSetTotalNumberOfMinions()) {
        oprot.writeI32(struct.totalNumberOfMinions);
      }
      if (struct.isSetCoordinatorAddress()) {
        oprot.writeString(struct.coordinatorAddress);
      }
      if (struct.isSetCoordinatorPort()) {
        oprot.writeI32(struct.coordinatorPort);
      }
      if (struct.isSetMinionRequirements()) {
        struct.minionRequirements.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildModeInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.mode = com.facebook.buck.distributed.thrift.BuildMode.findByValue(iprot.readI32());
        struct.setModeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.totalNumberOfMinions = iprot.readI32();
        struct.setTotalNumberOfMinionsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.coordinatorAddress = iprot.readString();
        struct.setCoordinatorAddressIsSet(true);
      }
      if (incoming.get(3)) {
        struct.coordinatorPort = iprot.readI32();
        struct.setCoordinatorPortIsSet(true);
      }
      if (incoming.get(4)) {
        struct.minionRequirements = new MinionRequirements();
        struct.minionRequirements.read(iprot);
        struct.setMinionRequirementsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

