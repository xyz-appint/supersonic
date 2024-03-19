package com.tencent.supersonic.headless.server.service;

import com.tencent.supersonic.auth.api.authentication.pojo.User;
import com.tencent.supersonic.headless.api.pojo.request.TagObjectReq;
import com.tencent.supersonic.headless.api.pojo.response.TagObjectResp;
import com.tencent.supersonic.headless.server.pojo.TagObjectFilter;

import java.util.List;

public interface TagObjectService {

    TagObjectResp create(TagObjectReq tagObjectReq, User user) throws Exception;

    TagObjectResp update(TagObjectReq tagObjectReq, User user);

    Boolean delete(Long id, User user) throws Exception;

    TagObjectResp getTagObject(Long id, User user);

    List<TagObjectResp> getTagObjects(TagObjectFilter filter, User user);
}
