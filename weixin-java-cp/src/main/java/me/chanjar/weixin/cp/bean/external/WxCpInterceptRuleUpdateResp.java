package me.chanjar.weixin.cp.bean.external;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.chanjar.weixin.cp.util.json.WxCpGsonBuilder;

import java.util.List;

/**
 * 更新敏感词规则请求参数封装实体类
 *
 * @author IceMake7  created on  2022-11-07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WxCpInterceptRuleUpdateResp {

  @SerializedName("rule_id")
  private String ruleId;
  @SerializedName("rule_name")
  private String ruleName;
  @SerializedName("word_list")
  private List<String> wordList;
  @SerializedName("intercept_type")
  private int interceptType;
  @SerializedName("extra_rule")
  private ExtraRule extraRule;
  @SerializedName("add_applicable_range")
  private AddApplicableRange addApplicableRange;
  @SerializedName("remove_applicable_range")
  private RemoveApplicableRange removeApplicableRange;

  /**
   * The type Extra rule.
   */
  @Data
  public static class ExtraRule {
    @SerializedName("semantics_list")
    private List<Integer> semanticsList;

    /**
     * From json Extra rule.
     *
     * @param json the json
     * @return the Extra rule
     */
    public static ExtraRule fromJson(String json) {
      return WxCpGsonBuilder.create().fromJson(json, ExtraRule.class);
    }

    /**
     * To json string.
     *
     * @return the string
     */
    public String toJson() {
      return WxCpGsonBuilder.create().toJson(this);
    }
  }

  /**
   * The type Add Applicable range.
   */
  @Data
  public static class AddApplicableRange {
    @SerializedName("user_list")
    private List<String> userList;
    @SerializedName("department_list")
    private List<Integer> departmentList;

    /**
     * From json add applicable range.
     *
     * @param json the json
     * @return the add applicable range
     */
    public static AddApplicableRange fromJson(String json) {
      return WxCpGsonBuilder.create().fromJson(json, AddApplicableRange.class);
    }

    /**
     * To json string.
     *
     * @return the string
     */
    public String toJson() {
      return WxCpGsonBuilder.create().toJson(this);
    }
  }

  /**
   * The type Remove Applicable range.
   */
  @Data
  public static class RemoveApplicableRange {
    @SerializedName("user_list")
    private List<String> userList;
    @SerializedName("department_list")
    private List<Integer> departmentList;

    /**
     * From json remove applicable range.
     *
     * @param json the json
     * @return the remove applicable range
     */
    public static RemoveApplicableRange fromJson(String json) {
      return WxCpGsonBuilder.create().fromJson(json, RemoveApplicableRange.class);
    }

    /**
     * To json string.
     *
     * @return the string
     */
    public String toJson() {
      return WxCpGsonBuilder.create().toJson(this);
    }
  }

  /**
   * From json wx cp intercept rule update resp.
   *
   * @param json the json
   * @return the wx cp intercept rule resp
   */
  public static WxCpInterceptRuleUpdateResp fromJson(String json) {
    return WxCpGsonBuilder.create().fromJson(json, WxCpInterceptRuleUpdateResp.class);
  }

  /**
   * To json string.
   *
   * @return the string
   */
  public String toJson() {
    return WxCpGsonBuilder.create().toJson(this);
  }

}
