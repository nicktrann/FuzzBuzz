/*
 * Copyright [2016] [Nicholas Tran - nicholastran2000 at yahoo dot com]
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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//////////////////////////////////////////////////////////////////////////////
//
// Using a for loop, find the factors of 3 and 5. If the number is a factor
// of 3 print out the number and the word fuzz. If the number is a factor
// of 5 print out the number and the word buzz. If the number is a factor of
// both then print out the number and the word fuzzbuzz. Else do not print
// anything.
//
//////////////////////////////////////////////////////////////////////////////
package com.ntran;

import static java.lang.System.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	new FuzzBuzz();
    }
}

class FuzzBuzz
{
    int end;

    public FuzzBuzz()
    {
        input();
        output();
    }

    public void input()
    {
        try
        {
            Scanner scan = new Scanner( in );
            out.print("Enter end number -->");
            end = Integer.valueOf(scan.nextLine());
        }
        catch(Exception e){}
    }

    public void output()
    {
        for (int x=1; x<=end; x++)
        {
            if(x%3==0 && x%5==0)
                out.println(x + " - fuzzbuzz");
            else
            if(x%3==0)
                out.println(x + " - fuzz");
            else
            if(x%5==0)
                out.println(x + " - buzz");

        }
    }

}