package cn.pj.cts.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author:Pengjie WU
 * @Description:TODO
 * @Date: Create in 20:29 2019/4/14
 * @Modify By:
 **/
@Entity
@Table(name = "TCS_SYSTEM_MENU_INFO")
@GenericGenerator(name = "jpa-uuid",strategy = "uuid")
@DynamicInsert(true)
public class SystemMenuModel extends BaseModel {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @Column(name = "MENU_ID",length = 32)
    private String menuId;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_URL")
    private String menuUrl;

    @Column(name = "MENU_SEQ_NUM")
    private Integer menuSeqNum;

    @Column(name = "MENU_INTRODUCE")
    private String menuIntroduce;

    @Column(name = "STATUS")
    private String status;
    /**model共有属性控制字*/
    @Column(name = "CONTROL_WORD")
    private String controlWord;
    /**model共有属性备注*/
    @Column(name = "REMARK")
    private String remark;
    /**model共有属性创建者*/
    @Column(name = "CREATOR")
    private String creator;
    /**model共有属性创建属性*/
    @Column(name = "CREATOR_DATETIME")
    private Date creatorDateTime;
    /**model共有属性修改者*/
    @Column(name = "MODIFIER")
    private String modifier;
    /**model共有属性修改时间*/
    @Column(name = "MODIFIER_DATETIME")
    private Date modifierDateTime;
    /**model共有属性版本控制*/
    @Column(name = "REC_VER")
    private Integer recVer;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getMenuSeqNum() {
        return menuSeqNum;
    }

    public void setMenuSeqNum(Integer menuSeqNum) {
        this.menuSeqNum = menuSeqNum;
    }

    public String getMenuIntroduce() {
        return menuIntroduce;
    }

    public void setMenuIntroduce(String menuIntroduce) {
        this.menuIntroduce = menuIntroduce;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getControlWord() {
        return controlWord;
    }

    public void setControlWord(String controlWord) {
        this.controlWord = controlWord;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatorDateTime() {
        return creatorDateTime;
    }

    public void setCreatorDateTime(Date creatorDateTime) {
        this.creatorDateTime = creatorDateTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifierDateTime() {
        return modifierDateTime;
    }

    public void setModifierDateTime(Date modifierDateTime) {
        this.modifierDateTime = modifierDateTime;
    }

    public Integer getRecVer() {
        return recVer;
    }

    public void setRecVer(Integer recVer) {
        this.recVer = recVer;
    }
}
