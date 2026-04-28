# [Gold III] Invested Money - 24991

[문제 링크](https://www.acmicpc.net/problem/24991)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 21, 맞힌 사람: 21, 정답 비율: 58.333%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Nowadays your programming skills are amazing, and you regularly receive lots of money for your work. Unfortunately, your financial skills did not evolve the same way. So each time you earn some money, you simply invest it in a bank in a 30 days time deposit with an automatic renewal clause. This means that 30 days after you invest the money, it is invested for 30 additional days, over and over again, until you inform the bank that you want to stop the renewal and get your money back. Time deposits cannot be created nor renewed during weekends; if a 30 days period ends on a weekend, the renewal occurs on the immediately following Monday.</p>

<p>Since the bank holds almost all your money, you must wait until the closest renewal each time you want to buy anything but daily food. Today you decided to buy a new smartphone to replace your six-month-old device. Given the dates when you created each time deposit, you must determine the minimum number of days that you must wait to get some money from the bank.</p>

<p>As an example, suppose that today is Saturday and that you created five time deposits: a time deposit last Monday, another time deposit last Tuesday, yet another time deposit last Wednesday, and two time deposits yesterday. The first time deposit (Monday) would be renewed on a Wednesday after 25 days from today. The second time deposit (Tuesday) would be renewed on a Thursday after 26 days from today. The third time deposit (Wednesday) would be renewed on a Friday after 27 days from today. Finally, the last two time deposits (Friday) would be renewed on a Monday after 30 days from today, because the renewal on a Sunday is not allowed. Thus, in this case, you must wait 25 days to get some money from the bank.</p>

### 입력

<p>The first line contains a string T and an integer N (1 &le; N &le; 10<sup>5</sup>), indicating respectively today&rsquo;s day of the week and the number of time deposits. The string is either &ldquo;<code>Mon</code>&rdquo;, &ldquo;<code>Tue</code>&rdquo;, &ldquo;<code>Wed</code>&rdquo;, &ldquo;<code>Thu</code>&rdquo;, &ldquo;<code>Fri</code>&rdquo;, &ldquo;<code>Sat</code>&rdquo;, or &ldquo;<code>Sun</code>&rdquo;, representing respectively that today is Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, or Sunday. The second line contains N integers D<sub>1</sub>, D<sub>2</sub>, . . . , D<sub>N</sub> (0 &le; D<sub>i</sub> &le; 10<sup>9</sup> for i = 1, 2, . . . , N), indicating the number of days elapsed since each time deposit was created. It is guaranteed that the time deposits were not created during weekends.</p>

### 출력

<p>Output a single line with an integer indicating the minimum number of days that you must wait to get some money from the bank.</p>