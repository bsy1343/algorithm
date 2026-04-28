# [Gold IV] Failing Roads - 6664

[문제 링크](https://www.acmicpc.net/problem/6664)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 16, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

파싱, 재귀, 문자열

### 문제 설명

<p>There are&nbsp;<em>n</em>&nbsp;towns in the kingdom of Failland. In the past, Failland used to have an excellent system of roads, connecting each town directly to each other, without any two roads crossing -- they used a complicated system of bridges to ensure this. Recently, however, the Road-workers Union split into&nbsp;<em>n</em>&nbsp;independent divisions, one for each town. Due to a huge aversion between divisions, each division strictly refuses to maintain roads that lead to a town controlled by any other division. Since initially each division controlled one town only, all of the roads were soon completely broken.</p>

<p>The wise king of Failland has decided to improve the situation using decrees. In several decrees, he ordered some of the divisions to unite again. Whenever road-workers received such a decree, they obeyed (<em>Well, wouldn&#39;t you obey the order when the only other option was to have your head chopped off?</em>) and the divisions in concern were immediately united into a single one. But since the workers are lazy and the decree did not explicitely say otherwise, the union process did not affect the roads being maintained. The united division still maintained only those roads that it used to maintain before.</p>

<p>Therefore, the king started to issue another type of decrees, saying that the road workers of some division must immediately repair all of the destroyed roads between the towns the division controls. He then repeated the whole process of uniting the divisions and ordering them to work several times, and finally, when only one united division remained, he considered the problem solved and went for a vacation.</p>

<p>However, citizens of Failland soon noticed that there is still something wrong, and that there are too few roads. After some research, they found out that whenever the workers of a division accepted an order to repair all of the destroyed roads, they also automatically supposed that they can stop maintaing the roads they maintained before, and such roads decayed quickly.</p>

<p>In order to persuade the king to return from the vacation and to solve the problem somehow, citizens have decided to find as many towns as possible such that no two of them are connected by a direct repaired road. They plan to send this list to the king because they feel it could help somehow. However, this task turned out to be too difficult, thus they decided to ask you for help.</p>

### 입력

<p>The input consists of several scenarios. Each scenario consists of a single line. This line contains an expression that describes the sequence of king&#39;s decrees, and hence also the current state of the roads in Failland. The expression is one of the following:</p>

<ul>
	<li><code>V</code>&nbsp;stands for a single town controlled by a single division.</li>
	<li><code>U</code>&nbsp;<em>e</em><sub>1</sub>&nbsp;<em>e</em><sub>2</sub>, where&nbsp;<em>e</em><sub>1</sub>&nbsp;and&nbsp;<em>e</em><sub>2</sub>&nbsp;are expressions. The expressions&nbsp;<em>e</em><sub>1</sub>&nbsp;and&nbsp;<em>e</em><sub>2</sub>&nbsp;correspond to disjoint sets of towns, each of the sets is under control of a different division of road-workers. The expression&nbsp;<code>U</code>&nbsp;<em>e</em><sub>1</sub>&nbsp;<em>e</em><sub>2</sub>&nbsp;describes the situation after the king ordered these divisions to unite, i.e., the new united division now controls all the towns in&nbsp;<em>e</em><sub>1</sub>&nbsp;and&nbsp;<em>e</em><sub>2</sub>, and maintains still the same set of roads (the union of the roads maintained before, as described by&nbsp;<em>e</em><sub>1</sub>&nbsp;and&nbsp;<em>e</em><sub>2</sub>).</li>
	<li><code>C</code>&nbsp;<em>e</em>, where&nbsp;<em>e</em>&nbsp;is an expression. This expression describes the situation after the division described by&nbsp;<em>e</em>&nbsp;received the order to take care of the roads they neglected so far. The division still controls the same set of towns, but now maintains exactly those roads they did not maintain before the order was received. Of course, only the roads connecting two towns both controlled by the same division are concerned. The roads they used to maintain before are not maintained anymore and are considered destroyed immediately.</li>
</ul>

<p>For example, &quot;<code>C U U V V V</code>&quot; describes the land with three towns controlled by a single union, and with all three roads between these towns in a perfect condition, forming a triangle. The expression &quot;<code>U C U U V V V C U U V V V</code>&quot; describes the land with six towns formed as a union of two such triangles. The expression &quot;<code>C U C U U V V V C U U V V V</code>&quot; describes the same land after the decree that orders road-workers to repair the neglected roads. Now the land has six towns and 9 roads -- all of the roads between all pairs of towns, except for those six that belonged to the triangles.</p>

<p>Each line of the input contains at most 200&nbsp;000 characters.</p>

### 출력

<p>The output for each scenario consists of a single line containing a single integer -- the maximum number of towns such that no two of them are connected by a maintained road.</p>