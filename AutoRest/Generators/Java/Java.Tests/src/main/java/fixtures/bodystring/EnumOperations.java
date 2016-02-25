/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * An instance of this class provides access to all the operations defined
 * in EnumOperations.
 */
public interface EnumOperations {
    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Colors object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Colors> getNotExpandable() throws ErrorException, IOException;

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNotExpandableAsync(final ServiceCallback<Colors> serviceCallback);

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putNotExpandable(Colors stringBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putNotExpandableAsync(Colors stringBody, final ServiceCallback<Void> serviceCallback);

}
