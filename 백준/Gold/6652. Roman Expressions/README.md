# [Gold IV] Roman Expressions - 6652

[문제 링크](https://www.acmicpc.net/problem/6652)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 25, 맞힌 사람: 18, 정답 비율: 47.368%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>As any other marketing company, ACM produces a lot of funky advertising items that may contain a logo and be given to customers and business partners as small gifts. A unique specialty of ACM is a calculator that uses roman numbers.</p>

<p>Roman numbers are able to express any non-negative integer using uppercase letters:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6652.%E2%80%85Roman%E2%80%85Expressions/58c24df7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6652.%E2%80%85Roman%E2%80%85Expressions/58c24df7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6652/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:176px; width:206px" /></p>

<p>Numbers are created by appending several letters together, the letter representing a higher value must always precede letters with lower values. The only exception are the letters &ldquo;I&rdquo;, &ldquo;X&rdquo;, and &ldquo;C&rdquo;, they may be used before higher letters to form values expressed by digits 4 and 9. The only possible combinations are:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6652.%E2%80%85Roman%E2%80%85Expressions/cd2f0ad4.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6652.%E2%80%85Roman%E2%80%85Expressions/cd2f0ad4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6652/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:144px; width:274px" /></p>

<p>Any roman number must first express thousands, then hundreds, tens, and ones. Therefore, 499 must always be written as &ldquo;CDXCIX&rdquo;, not &ldquo;ID&rdquo;.</p>

<p>Although not very practical, this gift is considered extremely &ldquo;cooooool&rdquo;. Your task is to write software for that calculator.</p>

### 입력

<p>The input will consist from commands, each written on a separate line. Possible commands are assignments, &ldquo;RESET&rdquo;, and &ldquo;QUIT&rdquo;.</p>

<p>An assignment command starts with a single digit representing one of ten registers that the calculator has. The register number is followed by an equal sign (&ldquo;=&rdquo;) and an expression. The expression will consist only from valid roman numbers, register names (digits), plus (&ldquo;+&rdquo;) and minus (&ldquo;-&rdquo;) signs. You may assume that the expression will always be valid and no longer than 10000 characters.</p>

### 출력

<p>For each command, output a single line. For assignments, print the register name, equal sign, and the value that is being assigned to that register. Instead of it, print the word &ldquo;Error&rdquo;, if the expression contains a reference to a register that has not been assigned before, or if the result is negative or larger than 10000. In such cases, no change to register values is made.</p>

<p>For RESET commands, invalidate all previous register assignments and print the word &ldquo;Ready&rdquo;.</p>

<p>The QUIT command will be the last one. Print the word &ldquo;Bye&rdquo; and terminate the program.</p>