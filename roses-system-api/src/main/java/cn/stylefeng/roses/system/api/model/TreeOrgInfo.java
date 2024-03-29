/**
 * Copyright 2018-2020 stylefeng & fengshuonan (sn93@qq.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.stylefeng.roses.system.api.model;

import cn.stylefeng.roses.kernel.model.tree.Tree;
import lombok.Data;

import java.util.List;

/**
 * 字典详细信息
 *
 * @author fengshuonan
 * @date 2018-07-25-上午10:55
 */
@Data
public class TreeOrgInfo implements Tree {

    /**
     * 字典id
     */
    private Long orgId;

    /**
     * 字典名称
     */
    private String orgName;

    /**
     * 上级代码id
     */
    private Long parentId;

    /**
     * tree子节点
     */
    private List<TreeOrgInfo> children;

    @Override
    public String getNodeId() {
        if (this.orgId == null) {
            return null;
        } else {
            return this.orgId.toString();
        }
    }

    @Override
    public String getNodeParentId() {
        if (this.parentId == null) {
            return null;
        } else {
            return this.parentId.toString();
        }
    }

    @Override
    public void setChildrenNodes(List linkedList) {
        this.children = linkedList;
    }

}
