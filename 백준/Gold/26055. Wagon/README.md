# [Gold III] Wagon - 26055

[문제 링크](https://www.acmicpc.net/problem/26055)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 21, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

자료 구조, 다이나믹 프로그래밍, 그리디 알고리즘, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Cimrman devised and built a railroad freight wagon capable of carrying a single construction crane. It has a specially built mechanism which automatically collapses and restores the crane again as the train moves through tunnels, narrow corridors in woods etc.</p>

<p>As any other active inventor, Cimrman is always short of money and he typically uses his current inventions in various unexpected ways to make him money for investments in his future creations.</p>

<p>This time he devised another unorthodox scheme. He attached the empty crane wagon to one of the regular cross country trains. Only one journey of the train is available to Cimrman and his crane wagon and he cannot change the direction of travel throughout the journey.</p>

<p>There is a list of crane types which can be sold and bought in each of the cities on the train journey. Often, the prices differ in various cities. Thus, Cimrman plans to buy a crane in one of the cities on the train path, load it on the train and in some of the next cities sell it with profit. He may repeat this action more times, each time buying a crane in a city and selling it in some of the next cities on the journey. Each time, he can transport only one crane. Also, he can travel between cities without carrying a crane if he considers it to be profitable.</p>

<p>Cimrman&rsquo;s private budget at the beginning of the journey is big enough to buy any crane in any city.</p>

<p>Cimrman wants to achieve maximum possible profit from the whole journey.</p>

### 입력

<p>The first line contains integer N (1 &le; N &le; 10<sup>5</sup>), the number of cities on the train path.</p>

<p>For each of N cities, there is an input block starting with line containing one integer M (1 &le; M &le; 10), the number of crane types for sale in that city.</p>

<p>Next in the block, there are M lines, each contains two integers I, P (0 &le; I &le; 10<sup>9</sup>, 0 &le; P &le; 10<sup>4</sup>), the ID of crane type for sale and its price. The order of the blocks is the same as the order of the cities on the train journey. The IDs are mutually different in a block and the price applies to both buying and selling the crane. In any city, Cimrman is allowed to both sell and buy only the types of cranes with the listed IDs in that city.</p>

### 출력

<p>Output one integer - the biggest profit Cimrman can achieve using his scheme.</p>