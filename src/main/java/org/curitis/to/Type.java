package org.curitis.to;

import java.io.Serializable;

public class Type implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.id
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.pid
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column type.type
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.id
     *
     * @return the value of type.id
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.id
     *
     * @param id the value for type.id
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.pid
     *
     * @return the value of type.pid
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.pid
     *
     * @param pid the value for type.pid
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column type.type
     *
     * @return the value of type.type
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column type.type
     *
     * @param type the value for type.type
     *
     * @mbg.generated Fri Apr 05 16:51:11 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }
}