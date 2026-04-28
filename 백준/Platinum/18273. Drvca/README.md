# [Platinum II] Drvca - 18273

[문제 링크](https://www.acmicpc.net/problem/18273)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 16, 맞힌 사람: 15, 정답 비율: 24.194%

### 분류

애드 혹, 많은 조건 분기, 자료 구조, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p><em>Advent in Zagreb</em> is a traditional holiday manifestation whose main attraction is a magical Christmas market located at the city centre. It should also be noted that this event was voted the best in Europe for three years in a row. Apart from travelling fast, good news also has the tendency to travel far. Indeed, the information about Advent in Zagreb reached North Pole and Santa Claus himself. Interestingly enough, Santa never visited Croatia (except for usual business on Christmas Eve). When you think about it, that makes sense since he doesn&rsquo;t really like summer activities by the sea and he can solve COCI problems from the comfort of his own home.</p>

<p>Luckily, he decided to visit our Christmas market so he sent a letter to the town hall stating that he will land on Zagreb&rsquo;s main square in the early morning of December 14<sup>th</sup>. After his on-site participation in a COCI round, he will have a guided tour of Zagreb&rsquo;s finest gastronomic sites by Mr. Malnar.</p>

<p>You are probably wondering: &ldquo;How exactly does Santa plan to land, there is no runway there!&rdquo;. You are right, there is not, but we&rsquo;ll manage. The town hall already prepared N Christmas trees that should be featured on the main square. Now, they will simply take those trees and place them in two rows which will define the boundaries of the runway. For some reason they want to make the absolute difference in height between each two neighbouring trees to be the same in each row. Moreover, they want to have the trees sorted in each row from the shortest to the highest. Help them divide the trees into two rows that satisfy these conditions.</p>

### 입력

<p>The first line contains an integer N (2 &le; N &le; 10<sup>5</sup>) from the task description.</p>

<p>The next line contains N integers h<sub>i</sub> (1 &le; h<sub>i</sub> &le; 10<sup>9</sup>) that denote the heights of all N Christmas trees.</p>

### 출력

<p>In the first line you should output an integer A which represents the number of trees in the first row. In the second line you should output A integers which represent the heights of the trees in the first row of the runway.</p>

<p>In the third line you should output an integer B which represents the number of trees in the second row. In the fourth line you should output B integers which represent the heights of the trees in the second row of the runway.</p>

<p>The rows are not allowed to be empty (A &gt; 0 and B &gt; 0) and each tree should be a part of one row (A + B = N). Also, trees should be sorted in each row from the shortest to the highest. If there are multiple solutions, you can output any of them. If there is no solution which satisfies the necessary conditions, you should output &minus;1 in the only line of output.</p>