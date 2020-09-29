package io.papermc.hangar.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
class RouteHelperTest {

    @Test
    void testSomeShit() throws Exception {
        assertEquals("/", Routes.getRouteUrlOf("showHome"));
        assertEquals("/organizations/new", Routes.getRouteUrlOf("org.showCreator"));
        assertEquals("/linkout", Routes.getRouteUrlOf("linkOut", ""));
        assertEquals("/linkout?remoteUrl=TestUrl", Routes.getRouteUrlOf("linkOut", "TestUrl"));
        assertEquals("/staff", Routes.getRouteUrlOf("users.showStaff", "", ""));
        assertEquals("/staff?sort=ASC&page=1", Routes.getRouteUrlOf("users.showStaff", "ASC", "1"));
        assertEquals("/staff?page=1", Routes.getRouteUrlOf("users.showStaff", "", "1"));
        assertEquals("/staff?sort=ASC", Routes.getRouteUrlOf("users.showStaff", "ASC", ""));
        assertEquals("/api/v1/projects/Essentials/EssentialsX/tags/1.33.7", Routes.getRouteUrlOf("apiv1.listTags", "Essentials", "EssentialsX", "1.33.7"));
        assertEquals("/api/v1/projects/Essentials/EssentialsX/pages?parentId=2", Routes.getRouteUrlOf("apiv1.listPages", "Essentials", "EssentialsX", "2"));
        assertEquals("/api/v1/projects/Essentials/EssentialsX/pages", Routes.getRouteUrlOf("apiv1.listPages", "Essentials", "EssentialsX", ""));
    }
}
