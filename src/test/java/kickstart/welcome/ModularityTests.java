/*
 * Copyright 2022-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kickstart.welcome;

import kickstart.Application;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.docs.Documenter.CanvasOptions;
import org.springframework.modulith.docs.Documenter.DiagramOptions;

/**
 * Test case to verify the modular structure of the application.
 *
 * @author Oliver Drotbohm
 */
class ModularityTests {

	ApplicationModules modules = ApplicationModules.of(Application.class);

	@Test
	@Disabled
	void verifyModularity() {
		modules.verify();
	}

	@Test
	@Disabled
	void generateDocs() throws IOException {

		new Documenter(modules)
				.writeDocumentation(DiagramOptions.defaults(), CanvasOptions.defaults());
	}
}
