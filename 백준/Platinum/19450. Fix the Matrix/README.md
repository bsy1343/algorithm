# [Platinum V] Fix the Matrix - 19450

[문제 링크](https://www.acmicpc.net/problem/19450)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 27, 정답: 7, 맞힌 사람: 7, 정답 비율: 38.889%

### 분류

백트래킹, 브루트포스 알고리즘, 해 구성하기, 구현

### 문제 설명

<p>Firstly, you need to output the matrix $H$ of size $6 \times 6$ filled with characters &#39;<code>A</code>&#39; and &#39;<code>B</code>&#39;.</p>

<p>In each of the requests the interactor will perform one of the following actions on matrix $H$ to obtain the new matrix $T$:</p>

<ol>
	<li>Change at most one character in each row of matrix $H$ and reorder its rows in an arbitrary manner.</li>
	<li>Change at most one character in each column of matrix $H$ and reorder its columns in an arbitrary manner.</li>
</ol>

<p>Operation of character changing means replacing some character &#39;<code>A</code>&#39; with character &#39;<code>B</code>&#39; or vice versa.</p>

<p>In each step you are to find out what type of action did the interactor perform. Also, it is necessary to determine for each row or column (depends on the action type) of matrix $T$ its position in the original matrix $H$.</p>

<p>Note that the <strong>exact order</strong> used by interactor is <strong>required</strong>. For example, if the whole matrix $H$ consists of characters &#39;<code>A</code>&#39; and interactor changed no characters but reordered some rows, the output with original or any other order, except for the one that is used by the interactor, would be considered incorrect. That is why it does not make sense to use, for example, matrix $H$ with duplicate rows or columns.</p>

<p>You are to write a program that fills the matrix $H$ and responds correctly to all requests from the interactor program.</p>

<p>It is possible that the same matrix can be obtained by performing action of either the first or the second type. In this case you are allowed to output both these variants, one after another. Your response will be considered correct if at least one variant is identical to that performed by the interactor.</p>

### 입력

<p>After your program has output matrix $H$, the interactor will start to provide your program with requests. For each request it will perform some type of action on the original matrix $H$ to obtain the result matrix $T$. Type of action (first or second) and order for rows or columns can be chosen by interactor depending on both matrix $H$ and test case. Each request starts with a line &quot;<code>Request</code>&quot; (quotes for clarity). This line is followed by six lines containing six characters each --- the matrix $T$.</p>

<p>After recieving line &quot;<code>Accepted</code>&quot;, your program should be terminated immediately.</p>

<p>It is guaranteed that there will be no more than $100$ requests and in each of them the interactor will provide you with a correct matrix $T$.</p>

### 출력

<p>Firstly your program should output six lines containing six characters each --- the initial matrix $H$. Each character should be either &#39;<code>A</code>&#39; or &#39;<code>B</code>&#39;.&nbsp;</p>

<p>For each of the following requests from the interactor your program should output either two or three lines.</p>

<ul>
	<li>If there are two possible actions with different action types that lead to the same matrix your program should output three lines. On the first line there should be the only integer $0$ (zero) denoting that there are two possible action types. The second line should describe the possible action of the first type and contain six space-separated integers --- $i$-th integer is the index of $i$-th row of matrix $T$ in the original matrix $H$. Similarly, the third line should describe the possible action of the second type and contain six space-separated integers --- $i$-th integer is the index of $i$-th column of matrix $T$ in the original matrix $H$.</li>
	<li>If there is the only possible action type your program should output two lines. On the first line there should be the only integer $t$ --- the type of action performed by the interactor. The second line should contain six space-separated integers --- $i$-th integer is the index of $i$-th row or column (depends on the action type) of matrix $T$ in the original matrix $H$.</li>
</ul>

<p>All rows are numbered with sequential integers from $1$ to $6$ from top to bottom, all columns are numbered in the same way from left to right.</p>