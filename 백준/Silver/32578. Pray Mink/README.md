# [Silver II] Pray Mink - 32578

[문제 링크](https://www.acmicpc.net/problem/32578)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 29, 맞힌 사람: 25, 정답 비율: 43.860%

### 분류

백트래킹, 소수 판정, 수학, 정수론

### 문제 설명

<p>Aaron, the mink, has two loves: biscuits and prime numbers. Growing up on our farm, he developed a special fondness for both. In the kitchen, he has cookie cutters shaped like the digits $0$ through $9$. He fills them with dough, bakes the digits, and arranges them in a row on a tray to form a whole positive number.</p>

<p>Recently, Aaron managed to bake and arrange a prime number. After admiring it, he got hungry and ate one of the digit-biscuits. Without rearranging the remaining digits, he simply shifted them left or right to fill the gap. To his delight, the new number was still prime!</p>

<p>Now, Aaron is curious to see how many prime numbers he can find in a row through this process. Each time, he eats a digit, shifts the remaining ones, and checks if the new number is prime. If leading zeros appear after eating a digit, he happily eats those as well right away. However, if at any point the resulting number is not prime, the process ends immediately.</p>

<p>Today, Aaron baked a new set of digits and formed a new number, not necessarily prime. Aaron’s goal is to see the maximum number of prime numbers in a row, starting with the initial number and continuing for as long as possible.</p>

<p>Your task is to compute the maximum possible number of occurrences of prime numbers in this process.</p>

### 입력

<p>The input consists of a single line with integer $N$ ($1 ≤ N ≤ 10^9$), the number baked by Aaron.</p>

### 출력

<p>Output one integer specifying the maximum number of prime numbers that Aaron can see through his process.</p>