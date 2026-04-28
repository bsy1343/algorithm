# [Platinum IV] Energy Harvesting - 17327

[문제 링크](https://www.acmicpc.net/problem/17327)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 36, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

조합론, 오일러 피 함수, 포함 배제의 원리, 수학, 정수론

### 문제 설명

<p>DongDong owns a rectangular strip of land. On it, he can plant a special type of energy plant with ability to harvest energy from the sun. After the plants have harvested the energy, DongDong will use an energy pooling machine to gather all the solar energy collected by the plants to one place.</p>

<p>DongDong&#39;s plants are neatly arranged arranged into&nbsp;<var>n</var>&nbsp;rows, with&nbsp;<var>m</var>&nbsp;plants in each row. The vertical and horizontal distances between adjacent plants are all the same. Thus, each of DongDong&#39;s plants can be represented with the coordinates (<var>x</var>,&nbsp;<var>y</var>), where&nbsp;<var>x</var>&nbsp;can be from 1 to&nbsp;<var>n</var>, and&nbsp;<var>y</var>&nbsp;can be from 1 to&nbsp;<var>m</var>, indicating that the plant is in column&nbsp;<var>y</var>&nbsp;of row&nbsp;<var>x</var>.</p>

<p>Since the energy pooling machine is rather large and hard to move, DongDong has placed it into a corner with the coordinates (0, 0). In the process of pooling energy, a certain amount of energy is bound to be lost. If the line segment formed between a plant and the pooling machine intersects with&nbsp;<var>k</var>&nbsp;other plants, then the energy lost will be 2<var>k</var>&nbsp;+ 1 units. For example, the machine is collecting energy from the plant at (2, 4), but since one plant at (2, 1) is on the line segment between them, the energy lost will be 3. Note: if there are no other plants on the line segment, then 1 unit of energy will be lost. Now, you must determine the total energy loss of the pooling process.</p>

<p>Following is an example of energy pooling for&nbsp;<var>n</var>&nbsp;= 5 and&nbsp;<var>m</var>&nbsp;= 4. There are a total of 20 plants. The number labeled beside each plant represents the energy loss for that plant.</p>

<p>&nbsp;</p>

<p>In this example, the total energy lost is 36.</p>

### 입력

<p>The input consists of a single line with two integers&nbsp;<var>n</var>&nbsp;and&nbsp;<var>m</var>.</p>

### 출력

<p>The output should consist of a single integer, representing the total energy loss.</p>

### 제한

<p>1 &le;&nbsp;<var>n</var>,&nbsp;<var>m</var>&nbsp;&le; 100,000</p>