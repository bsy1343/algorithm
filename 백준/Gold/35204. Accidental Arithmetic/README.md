# [Gold II] Accidental Arithmetic - 35204

[문제 링크](https://www.acmicpc.net/problem/35204)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 10, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

기댓값의 선형성, 수학, 확률론

### 문제 설명

<p>It is the 25th of January, 2025. You are working on your final report for the statistics class. However, when you enter the calculations into your trusted Brittle Arithmetic Portable Calculator, you notice that the <kbd>+</kbd> and <kbd>-</kbd> buttons have malfunctioned. Whenever you press a numeric button (a button from <kbd>0</kbd> through <kbd>9</kbd>), an additional button press may be registered immediately after: either the <kbd>+</kbd> button, or the <kbd>-</kbd> button, or neither (but never both). "Ugh," you think to yourself, "why did I not buy a Backup Arithmetic Portable Calculator..." But then you get an idea to save yourself from getting a low grade.</p>

<p>After some experimentation, you statistically determined that pressing a numeric button results in an additional <kbd>+</kbd> input $45\%$ of the time, and the same holds for the <kbd>-</kbd> button (and never both at the same time). You decide that you should write your report about your findings. In addition to statistical analysis, the teacher requires you to perform some probabilistic predictions based on a statistical model. You decide to investigate what your calculator does when you try to simply input a natural number.</p>

<p>Given a natural number $n$, you consider entering the number into the calculator by pressing the numeric buttons corresponding to the standard base $10$ representation of $n$. The calculator may register a <kbd>+</kbd> or <kbd>-</kbd> button press in between the digits of $n$, which results in an arithmetic expression. You wonder what happens if you press <kbd>=</kbd> to evaluate the expression. Luckily, if your expression ends with a <kbd>+</kbd> or <kbd>-</kbd>, the calculator ignores this, such that this evaluation always results in an integer. To finish your report, you decide to write a program that determines the expected value of this result for any given value of $n$.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($0 \leq n &lt; 10^{1000}$), the number that you will enter into the calculator.</li>
</ul>

### 출력

<p>Output the expected value of the result.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>