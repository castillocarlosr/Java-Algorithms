static bool isSubstring(String str1, String str2) 
    { 
        int s1Len = str1.length(); 
        int s2Len = str2.length(); 
      
        int i; 
        for (i = 0; i <= N - M; i++) { 
            int j; 
            for (j = 0; j < M; j++) 
                if (s2.charAt(i + j) != s1.charAt(j)) 
                    break; 

            if (j == M) 
                return true; 
        } 
        return false; 
    }