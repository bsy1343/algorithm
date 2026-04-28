# [Gold IV] Gas Station Numbers - 4405

[문제 링크](https://www.acmicpc.net/problem/4405)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 15, 맞힌 사람: 15, 정답 비율: 57.692%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>Many gas stations use plastic digits on an illuminated sign to indicate prices. When there is an insufficient quantity of a particular digit, the attendant may substitute another one upside down.<br />
The digit &quot;6&quot; looks much like &quot;9&quot; upside down. The digits &quot;0&quot;, &quot;1&quot; and &quot;8&quot; look like themselves. The digit &quot;2&quot; looks a bit like a &quot;5&quot; upside down (well, at least enough so that gas stations use it).</p>

<p>Due to rapidly increasing prices, a certain gas station has used all of its available digits to display the current price. Fortunately, this shortage of digits need not prevent the attendant from raising prices. She can simply rearrange the digits, possibly reversing some of them as described above.</p>

<p>Your job is to compute, given the current price of gas, the next highest price that can be displayed using exactly the same digits.</p>

### 입력

<p>The input consists of several lines, each containing between 2 and 30 digits (to account for future prices) and a decimal point immediately before the last digit. There are no useless leading zeroes; that is, there is a leading zero only if the price is less than 1.</p>

### 출력

<p>You are to compute the next highest price that can be displayed using the same digits and the same format rules. An input line containing a decimal point alone terminates the input. If the price cannot be raised, print &quot;The price cannot be raised.&quot;</p>