# [Platinum IV] Unique Ability - 27630

[문제 링크](https://www.acmicpc.net/problem/27630)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 8, 정답 비율: 47.059%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Emma lives in Shu Nation, a peaceful and technologically advanced nation, where it has N cities that are connected by M bidirectional roads. To traverse the i<sup>th</sup> road from one end to the other end, one needs exactly T<sub>i</sub> minute. It is possible to travel from a city to any city using these roads.</p>

<p>Each resident in Shu Nation is assigned to an integer representing their group identifier so that its government can better control the residents&rsquo; movements. How? Each road in Shu Nation is equipped with a security system that allows only those with a group identifier of P<sub>i</sub> to pass it; those with a different group identifier cannot use the road. Shu Nation believes that such a system might reduce the congested roads problems that they have faced for centuries.</p>

<p>Emma has a group identifier of 1, initially. Here comes the interesting part. Emma has the ability to change her group identifier to any other integer as she likes. It seems that she does some hacking in order to do that, but no, she didn&rsquo;t. To change her group identifier from a into b, she only needs to stay still and meditate for exactly |a &minus; b| minutes. She can only do this while she&rsquo;s in a city; she cannot change her group identifier while on a road. That&rsquo;s her unique ability.</p>

<p>Emma is at city 1 and wants to visit her friend at city N. To avoid any suspicion from the government, Emma should change her group identifier back to 1 once she arrives at city N (if she ever changes it).</p>

<p>Your task is to determine the minimum time needed by Emma to go to her friend at city N from city 1.</p>

### 입력

<p>Input begins with a line containing two integers N M (2 &le; N &le; 200 000; N &minus; 1 &le; M &le; 200 000) representing the number of cities and the number of bidirectional roads in Shu Nation, respectively. The next M lines each contains four integers A<sub>i</sub> B<sub>i</sub> P<sub>i</sub> T<sub>i</sub> (1 &le; A<sub>i</sub>, B<sub>i</sub> &le; N;  A<sub>i</sub> &ne; B<sub>i</sub>; 1 &le; P<sub>i</sub>, T<sub>i</sub> &le; 10<sup>9</sup>) representing a bidirectional road connecting city A<sub>i</sub> and city B<sub>i</sub> that requires T<sub>i</sub> minutes to traverse and can only be used by those who have a group identifier of P<sub>i</sub>. It is guaranteed that from any city you can reach any other cities by going through one or more roads.</p>

### 출력

<p>Output contains an integer in a line representing the minimum time for Emma to go from city 1 to city N and ends her trip with a group identifier of 1.</p>