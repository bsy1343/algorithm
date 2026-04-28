# [Platinum I] Dividing the Kingdom - 23390

[문제 링크](https://www.acmicpc.net/problem/23390)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 12, 맞힌 사람: 10, 정답 비율: 52.632%

### 분류

자료 구조, 분리 집합, 그래프 이론, 포함 배제의 원리, 두 포인터

### 문제 설명

<p>The kingdom of Nlogonia has historically been a very wealthy and quiet place. However, the current circumstances could bring this era of peace and prosperity to an end: The king is a father of two twins, so both of them are heirs to the throne.</p>

<p>The twins don&rsquo;t get along well and are jealous and overly competitive towards each other. Due to this, having both of them rule over the kingdom cooperatively is not a viable option. The kingdom will have to be divided into two independent principalities so that each of them can be given to each prince. Also, the division needs to be totally fair to avoid conflict between the envious brothers.</p>

<p>The kingdom consists of N cities and M roads connecting pairs of cities. The Nlogonians are peculiarly proud of their roads. Each road has an associated positive value which represents its beauty.</p>

<p>The kingdom will be divided in this manner: First, the cities will be partitioned in two sets such that every city is in one and only one set. Then, each principality will consist of the cities in one set and the roads connecting cities of this same set. Roads that connect cities of different principalities will be destroyed, as the princes are not interested in trading with each other, and keeping the roads would only make war more likely.</p>

<p>The beauty of a principality is defined as the maximum beauty of the roads within the principality, or 0 (zero) if the principality has no roads at all. For obvious reasons, the king would like the beauty of both principalities to be the same.</p>

<p>Help the king determine all the possible values of the beauty of the resulting principalities, given that the division is made in such a way that the principalities are equally beautiful.</p>

### 입력

<p>The first line contains two integers N, M (1 &le; N, M &le; 5 &times; 10<sup>5</sup>), representing the number of cities and the number of roads respectively.</p>

<p>Each of the next M lines contains three integers x<sub>i</sub>, y<sub>i</sub>, b<sub>i</sub> (1 &le; x<sub>i</sub> &lt; y<sub>i</sub> &le; N, 1 &le; b<sub>i</sub> &le; 10<sup>9</sup>), representing that there&rsquo;s a road which connects cities x<sub>i</sub> and y<sub>i</sub> and has beauty b<sub>i</sub>. There&rsquo;s no two roads connecting the same pair of cities.</p>

### 출력

<p>If it&rsquo;s not possible to divide the kingdom so that both principalities have the same beauty, output a line with the string &ldquo;<code>IMPOSSIBLE</code>&rdquo;. Otherwise, output all the possible values for principality beauty resulting from divisions in principalities with equal beauty. Values should be outputted in ascending order, each in its own line.</p>