# [Gold III] Kisik - 17044

[문제 링크](https://www.acmicpc.net/problem/17044)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 27, 맞힌 사람: 24, 정답 비율: 72.727%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 정렬

### 문제 설명

<p>The Colonial Alliance of Intergalactic Nations (CAIN) has decided to build a town on Mars for K families. It is therefore necessary to build a total of K buildings, one for each family. For each family, one of N different building designs that were prepared by the best architects in the universe will be selected. All buildings are of rectangular shape, and the i<sup>th</sup> building is W<sub>i</sub> units wide and H<sub>i</sub> units high. In addition, due to the variety promoted by CAIN, all families will get different designs.</p>

<p>Buildings are built next to each other, so that their bottom sides lie on the same line. After construction, the city needs to be filled with air, so the city will be enclosed by a huge glass wall that will keep the air inside. The wall will also be of a rectangular shape with sides parallel to the building sides.</p>

<p>Since maintaining air on Mars is expensive, your job is to choose a single assignment between all possible ones in a way that will require the least amount of air (one unit of air is required to supply unit sized square)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17044.%E2%80%85Kisik/ed702889.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17044.%E2%80%85Kisik/ed702889.png" data-original-src="https://upload.acmicpc.net/bf9a2b47-3bb0-4e6b-9b6c-e411eff81dfb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 279px; height: 123px;" /></p>

<p style="text-align: center;">A possible city from the first sample test, which only needs 20 air units. We chose not to build the building which is 3 units wide.</p>

### 입력

<p>The first line contains two integers N and K from the task description (1 &le; K &le; N &le; 1 000 000).</p>

<p>In the next N lines there are two integer numbers W<sub>i</sub> and H<sub>i</sub>, width and height of the i<sup>th</sup> building (1 &le; W<sub>i</sub>, H<sub>i</sub> &le; 1 000 000). All the pairs (W<sub>i</sub>, H<sub>i</sub>) will be mutually different.</p>

### 출력

<p>Write the minimum amount of air in the first line.</p>