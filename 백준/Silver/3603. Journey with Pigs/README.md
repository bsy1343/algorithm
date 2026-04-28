# [Silver I] Journey with Pigs - 3603

[문제 링크](https://www.acmicpc.net/problem/3603)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 58, 정답: 38, 맞힌 사람: 26, 정답 비율: 68.421%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Farmer John has a pig farm near town A. He wants to visit his friend living in town B. During this journey he will visit n small villages so he decided to earn some money. He tooks n pigs and plans to sell one pig in each village he visits.</p>

<p>Pork prices in villages are different, in the j-th village the people would buy a pork at p<sub>j</sub> rubles per kilogram. The distance from town A to the j-th village along the road to town B is d<sub>j</sub> kilometers.</p>

<p>Pigs have different weights. Transporting one kilogram of pork per one kilometer of the road needs t rubles for addition fuel.</p>

<p>Help John decide, which pig to sell in each town in order to earn as much money as possible.</p>

### 입력

<p>The first line of the input file contains integer numbers n (1 &le; n &le; 1000) and t (1 &le; t &le; 10<sup>9</sup>). The second line contains n integer numbers w<sub>i</sub> (1 &le; w<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the weights of the pigs. The third line contains n integer numbers d<sub>j</sub> (1 &le; d<sub>j</sub> &le; 10<sup>9</sup>) &mdash; the distances to the villages from the town A. The fourth line contains n integer numbers p<sub>j</sub> (1 &le; p<sub>j</sub> &le; 10<sup>9</sup>) &mdash; the prices of pork in the villages.</p>

### 출력

<p>Output n numbers, the j-th number is the number of pig to sell in the j-th village. The pigs are numbered from 1 in the order they are listed in the input file.</p>