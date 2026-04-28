# [Platinum II] Winter Roads - 7148

[문제 링크](https://www.acmicpc.net/problem/7148)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 112, 정답: 26, 맞힌 사람: 18, 정답 비율: 28.125%

### 분류

브루트포스 알고리즘, 그래프 이론, 최소 스패닝 트리, 오프라인 쿼리

### 문제 설명

<p>Winter is coming, and the citizens of Winterfell are making preparations for the long months ahead. One particular concern is the stability of the roads and bridges; supply lines must stay uninterrupted as the season progresses.</p>

<p>The civil engineers of Winterfell would like to model possible scenarios of roads failing and repairs that need to be made. In their model, each road connects two landmarks in the city, and each road has a certain carrying capacity. Trucks travel from landmark to landmark, and can only travel on sufficiently sturdy roads. In particular, a supply truck with weight w can travel on a road with capacity c iff w&le;c. Whether by nature or by accident, the capacity of a road can decrease over time. In addition, repairs can increase the carrying capacity of a road. While roads change, however, supply trucks still need to be able to get from source to destination, and the engineers would like to test whether trucks can still make certain runs between landmarks.</p>

<p>Given a series of changes to the roads and some supply truck runs, help the engineers check whether or not supplies can still be delivered as winter strikes.</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with two integers n, m (1&le;n&le;1,000, 1&le;m&le;100,000), where n is the number of landmarks, and m is the number of roads between them. This will be followed by m lines, each with three integers a, b, and c (1&le;a,b&le;n and 1&le;c&le;1,000,000,000) representing a road between landmarks a and b with carrying capacity c. Roads are numbered 1, 2, 3, &hellip;, m in the order that they appear in the input.</p>

<p>Next will be a line with a single integer e (1&le;e&le;100,000), indicating the number of events. This will be followed by e lines, consisting of a capital letter followed by integers:</p>

<ul>
	<li>B r c: Indicates that road r breaks down. Its carrying capacity decreases to c. (1&le;r&le;m, 1&le;c&lt;1,000,000,000)</li>
	<li>R r c: Indicates that road r is repaired. Its carrying capacity increases to c. (1&le;r&le;m, 1&lt;c&le;1,000,000,000)</li>
	<li>S a b w: Check whether or not a supply truck with weight w can travel from landmark a to landmark b. (1&le;a,b&le;n, 1&le;w&le;1,000,000,000)</li>
</ul>

<p>Only capital letters B, R or S will appear. All events occur in the order given in the input. There will be at most 2,000 breakdown / repair events in the input. The input will end with a line with two 0s.</p>

### 출력

<p>For each S a b w query, in order, output 1 if the there is a path from a to b that can support a truck of weight w, and 0 if there is not. Output each number on its own line, with no spaces. Do not print any blank lines between outputs.</p>