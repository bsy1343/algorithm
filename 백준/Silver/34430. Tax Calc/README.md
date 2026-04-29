# [Silver I] Tax Calc - 34430

[문제 링크](https://www.acmicpc.net/problem/34430)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 13, 정답 비율: 81.250%

### 분류

구현, 스택, 자료 구조, 재귀

### 문제 설명

<p>The King wants a calculator to determine how much tax his kingdom is collecting, and he has chosen you to complete this task for him.</p>

<p>As you listen to the King, you realize there are several problems. The first is that some people, in an attempt to dodge taxes, don't just report a number--instead, they report some complex calculation! Sadly, you have to tabulate these people's taxes just like everyone else's. The second problem is that, over the years, the tax code of the Kingdom has gotten very complex. That is, instead of just simple additions, some tax calculations include subtraction and division (although <em>not</em> multiplication--that's illegal in the Kingdom). You will have to make sure you count these taxes appropriately as well.</p>

<p>Given a tax calculation, you need to report the total amount of tax collected. A tax calculation might, for example, be provided as the following:</p>

<p><code>( + 50 70 ( / 300 4 ) )</code>.</p>

<p>This means that three people have paid a tax (the Kingdom is not large). The first two reported a constant amount, while the third reported their tax as a quotient instead. The King needs you to sum the taxes paid by each taxpayer to determine the total.</p>

### 입력

<p>The input consists of one line containing a tax calculation. A tax calculation begins with <code>(</code> and ends with <code>)</code>. Between each set of parentheses, there will be one operator (<code>+</code>, <code>-</code>, or <code>/</code>). After the operator will be between 2 and 1000 tax reportings.</p>

<p>Each tax reporting may be either a single integer $i$ ($1 \leq i \leq 100\ 000$), or it may be a subcalculation. A subcalculation begins with <code>(</code> and ends with <code>)</code>. Between these parentheses, there will be one operator (<code>+</code>, <code>-</code>, or <code>/</code>). After the operator will be between 2 and 1000 integers $i$ ($1 \leq i \leq 100\ 000$).</p>

<p>Each item (paren, operator, tax reporting, or any corresponding subcalculation component) will be separated from every other item by one space.</p>

<p>If a calculation or subcalculation begins with the operator <code>-</code> or the operator <code>/</code>, then there will only be two following reportings (for a calculation) or integers (for subcalculations).</p>

<p>No quotient will have a fractional result, but some differences may be negative.</p>

### 출력

<p>Output the total tax collected.</p>