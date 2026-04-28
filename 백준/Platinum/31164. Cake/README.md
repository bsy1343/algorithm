# [Platinum I] Cake - 31164

[문제 링크](https://www.acmicpc.net/problem/31164)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 9, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

자료 구조, 애드 혹, 세그먼트 트리, 홀짝성

### 문제 설명

<p>Once upon a time Babushka Bajtmiła (known for the exception pierogi from problem B) baked a cake. She cut it into $2n$ rectangular pieces (two rows containing $n$ pieces each) and put colour icing on the top of each piece. She looked at her masterpiece and was taken aback: the colour scheme looked absolutely awful.</p>

<p>Bajtmiła decided that she needs to change the colour configuration to something better. Unfortunately, changing the locations of the pieces one by one is out of question: any attempt to take out a single piece out of the cake would inevitably make its sides chipped. Babushka Bajtmiła would never serve her guests a cake which appears raggedly cut!</p>

<p>Fortunately, Bajtmiła possesses a rectangular spatula which can fit exactly four pieces (in two rows containing two pieces each). She can therefore carefully take four such pieces out, rotate the spatula and insert them back from the opposite side. We can formally describe this operation as taking a $2$ x $2$ square and rotating it by $180$ degrees.</p>

<p>Remembering your quick and efficient help in problem B, Babushka knew exactly what to do: she asked you to determine the minimum possible number of operations that would turn her initial frosting configuration into something nice. Of course, you did what any decent person would do in your place: you said you won&#39;t be able to help because the problem is not well-defined. Bajtmiła expected that: she went to the whiteboard and draw one specific <em>nice</em> configuration and asked you to find the minimal number of operations to change her initial frosting configuration into this specific one.</p>

<p>It might have also happened that the granny (tired from moving all the pierogi in problem B) was mistaken and it is actually impossible to obtain the desired configuration. In such case you also need to notify her as soon as possible!</p>

### 입력

<p>The first line of input contains the number of test cases $z$ ($1 \leq z \leq 10\,000$). The descriptions of the test cases follow.</p>

<p>The first line of a test case contains an integer $n$ ($2 \leq n \leq 500\,000$). The following two lines of input describe two rows of the initial frosting configuration. Each of them contains $n$ integers from the range $[1, 10^9]$ separated by single spaces --- identifiers of frosting colours on the subsequent pieces of the cake. Note that a colour may appear more than once.</p>

<p>The next two lines describe the final configuration in the same format.</p>

<p>The total sum of $n$ over all the test cases does not exceed $2 \,000\,000$.</p>

### 출력

<p>For each test case output a single integer --- the minimum possible number of operations needed to achieve the final configuration. If it is not possible to achieve the desired outcome, print $-1$.</p>

### 힌트

<p>In the first test case the initial configuration is</p>

<pre>
1 2 3 2
4 3 1 3
</pre>

<p>We can achieve the desired configuration in three steps:</p>

<p>1. rotating the leftmost square,</p>

<pre>
3 4 3 2
2 1 1 3
</pre>

<p>2. rotating the rightmost square,</p>

<pre>
3 4 3 1
2 1 2 3
</pre>

<p>3. rotating the middle square.</p>

<pre>
3 2 1 1
2 3 4 3
</pre>

<p>It is not possible to achieve the desired configuration in the second test case.</p>