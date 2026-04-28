# [Gold I] Afternoon Tea - 7913

[문제 링크](https://www.acmicpc.net/problem/7913)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 32 MB

### 통계

제출: 222, 정답: 78, 맞힌 사람: 46, 정답 비율: 31.724%

### 분류

수학, 누적 합

### 문제 설명

<p>During his visit at Bytic Islands Byteasar really enjoyed the national beverage of Byteans, that is, tea with milk. This drink is always prepared in a strictly determined manner, which is as follows. Firstly the teacup is filled with tea mixed half and half with milk. Then, an n-letter ceremonial word consisting of letters H and M is chosen. Now, for i = 1, 2,&nbsp;..., n, the following action is performed: if the i-th letter of the ceremonial word is H, one should drink half of the teacup, add tea until the teacup is full and stir. On the other hand, if the i-th letter of the word is M, one should perform a similar action, however milk should be added instead of tea. After such action is performed for each letter of the ceremonial word, the remaining liquid is disposed of.</p>

<p>Each time Byteasar performs the ceremony, he wonders which of the ingredients he has drunk more: tea or milk. Help Byteasar answer this question.</p>

### 입력

<p>The first line of input holds an integer n (1 &le; n &le; 100 000). The second line contains an n-letter word consisting of letters H and M; this is the ceremonial word used by Byteasar.</p>

### 출력

<p>Your program should output a single letter H if Byteasar has drunk more tea than milk; a single letter M if he has drunk more milk than tea; or the word HM if he has drunk equal amounts of tea and milk.</p>

### 힌트

<p>Explanation of the example: Byteasar has drunk 1+37/64 teacups of tea and 59/64 teacups of milk in total.</p>