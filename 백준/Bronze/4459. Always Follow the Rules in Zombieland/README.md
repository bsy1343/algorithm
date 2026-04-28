# [Bronze III] Always Follow the Rules in Zombieland - 4459

[문제 링크](https://www.acmicpc.net/problem/4459)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 808, 정답: 579, 맞힌 사람: 540, 정답 비율: 72.386%

### 분류

구현, 문자열

### 문제 설명

<p>Welcome to Zombieland! For the next five hours, your team will battle wits with hordes of the undead. Do you have the cunning, will, and stamina to survive? Follow the rules, and you may live to tell the tale.</p>

<p>In Zombieland, there are a fundamental set of rules you must follow to stay alive. Rule 8 is &ldquo;Get a kick&amp;@% partner&rdquo;, rule 18 is &ldquo;Limber up&rdquo;, rule 29 is &ldquo;The buddy system&rdquo;, and rule 22 is, &ldquo;When in doubt, know your way out&rdquo;.</p>

<p>If you intend to survive for long in Zombieland, you&rsquo;ll need to know which rule number goes with which quote. Write a program to display the correct quote given the rule number.</p>

<p>Have fun during your stay in Zombieland, and remember rule 32, &ldquo;Enjoy the little things&rdquo;.&nbsp;</p>

### 입력

<p>Input will begin with an integer q, 0 &lt; q &le; 50, on its own line signifying the number of quotes. On the following lines will be the quotes, one per line. No quote will be greater than 65 characters. The first quote will be rule 1, the second quote rule 2, etc. Following these quotes will be an integer r, 0 &lt; r &le; 50 on a line of its own signifying the number of rules to look up quotes for, followed by a sequence of r rule numbers, one per line.</p>

### 출력

<p>For each rule number, display &ldquo;Rule&rdquo;, followed by a single space, then the rule number, then a &ldquo;:&rdquo; and a single space followed by the appropriate quote. If a rule number falls outside the range of quotes, display the message &ldquo;No such rule&rdquo;, instead of a quote.</p>