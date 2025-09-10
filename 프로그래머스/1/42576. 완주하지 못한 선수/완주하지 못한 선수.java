class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> = map = new HashMap();
       
        for (int i = 0; i < participant.length, i++) {
            map.put(participant[i], 0);
        }
        
        for (int i = 0; i < completion.length, i++) {
            map.put(completion[i], 1);
        }
        
        for (Map.Entry(String, Integer) entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                answer = entry.getKey();
            }
        }
        
        
        return answer;
    }
}