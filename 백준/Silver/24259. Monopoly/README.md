# [Silver II] Monopoly - 24259

[문제 링크](https://www.acmicpc.net/problem/24259)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 17, 맞힌 사람: 17, 정답 비율: 58.621%

### 분류

해 구성하기, 그래프 이론

### 문제 설명

<p>Deni enjoys playing the game monopoly very much. But the duration of one game is very long &ndash; from 5 to 7 hours. So, Deni starts thinking about changing the classical rules. The players in monopoly usually move in one direction from space to space and after some time they return to the beginning, start again and so on. In the new version, the movement will again be from space to space but from the current one there can be several possibilities for the next move. Deni wants to find such directed connections between the spaces, so that a player can never return to a space, where he has been, no matter how he moves (of course, following the rules). In such a way the game will be shorter in duration</p>

<p>She has already begun making the new board &ndash; she has chosen the number of spaces N (the spaces are numbered from 1 to N) and she has made a list with M connections (each connection has a direction and there is no connection that connects a space with itself). If space i is connected to space j, then there is no direct connection in the opposite direction, i.e. from space j to space i, and also, there are no other direct connections from space i to space j. Deni thought that she was ready with the new board, but suddenly she noticed that the condition she wants (when you move from space to space, using the connections, you cannot return to a previously visited space) doesn&rsquo;t hold for her list of connections. She first thought to remove some of the direct connections, but that will result in rewriting the list, which can be really long. That&rsquo;s why Deni decided to reverse the direction of some of the directed connections.</p>

<p>You are regularly playing monopoly with Deni. That&rsquo;s why you want to help her by writing the program, which has to tell her which connections to reverse so that the stated condition will hold. The program has to contain the function <code>find_reverse</code> which will be compiled with the jury&rsquo;s program.</p>

### 입력



### 출력



### 제한

<ul>
	<li>3 &le; N &le; 5 &times; 10<sup>5</sup></li>
	<li>3 &le; M &le; 1.5 &times; 10<sup>6</sup></li>
</ul>