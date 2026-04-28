# [Silver V] Jarvis - 17048

[문제 링크](https://www.acmicpc.net/problem/17048)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 155, 정답: 128, 맞힌 사람: 99, 정답 비율: 85.345%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Ivan sent N drone warriors to the final battle against Tony Stark, also known as Iron Man. Each drone has a defined frequency, expressed as an integer number, on which it receives commands from Ivan during the fight. Jarvis, the artificial intelligence developed by Toni, has to determine which frequencies those are and thereby take control over as many drones as possible.</p>

<p>Jarvis knows the original factory values of the frequency for each drone, but the frequencies required for each drone, unfortunately, have been changed in the meantime.</p>

<p>Jarvis has only one attempt. He can choose an integer number X and increase each of the factory frequencies by X (X may be negative as well). After that, Jarvis will take over control of each drone whose modified factory frequencies and the one required by the specific drone is equal.</p>

<p>Write a program that will determine how much drone warriors Jarvis can take control over.</p>

### 입력

<p>The first line contains the integer number N (1 &le; N &le; 100 000), the number of drones from the task statement.</p>

<p>In the second line there are N integers A<sub>i</sub> (-1 000 000 &le; A<sub>i</sub> &le; 1 000 000) representing the factory frequency values of the drone warrior.</p>

<p>In the third line there are N integers B<sub>i</sub> (-1 000 000 &le; B<sub>i</sub> &le; 1 000 000) representing the required frequency values of the drone warriors.</p>

### 출력

<p>In the only line, print out the largest number of drone warriors Jarvis can take control over.</p>