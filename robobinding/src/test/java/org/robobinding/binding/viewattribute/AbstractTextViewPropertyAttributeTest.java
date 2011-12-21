/**
 * Copyright 2011 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.robobinding.binding.viewattribute;

import org.junit.Before;
import org.robobinding.binding.ViewAttribute;

import android.app.Activity;
import android.widget.TextView;

import com.xtremelabs.robolectric.Robolectric;
import com.xtremelabs.robolectric.shadows.ShadowTextView;

/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public abstract class AbstractTextViewPropertyAttributeTest
{
	protected TextView textView;
	protected ShadowTextView shadowTextView;
	@Before
	public void setUp()
	{
		textView = new TextView(new Activity());
		shadowTextView = Robolectric.shadowOf(textView);
	}
	
	protected <T> MockPresentationModelAdapterForProperty<T> bindToProperty(ViewAttribute backgroundAttribute, Class<T> propertyType)
	{
		return MockPresentationModelAdapterForProperty.bindToProperty(backgroundAttribute, propertyType);
	}
}