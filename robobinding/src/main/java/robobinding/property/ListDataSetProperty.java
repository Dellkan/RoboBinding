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
package robobinding.property;

import java.util.List;



/**
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 * @author Cheng Wei
 *
 */
public class ListDataSetProperty<T> extends AbstractDataSetProperty<T>
{
	public ListDataSetProperty(Object bean, PropertyAccessor<Object> propertyAccessor)
	{
		super(bean, propertyAccessor);
	}
	@Override
	public int size()
	{
		return getData().size();
	}
	@Override
	public T getItem(int index)
	{
		List<T> data = getData();
		return data.get(index);
	}
	private List<T> getData()
	{
		@SuppressWarnings("unchecked")
		List<T> data = (List<T>)getValue();
		return data;
	}
}
