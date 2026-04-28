# [Gold IV] Random Digital Exponentiation - 24828

[문제 링크](https://www.acmicpc.net/problem/24828)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 22, 맞힌 사람: 19, 정답 비율: 33.929%

### 분류

수학, 정수론, 백트래킹

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24828.%E2%80%85Random%E2%80%85Digital%E2%80%85Exponentiation/ac5f36ac.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24828.%E2%80%85Random%E2%80%85Digital%E2%80%85Exponentiation/ac5f36ac.png" data-original-src="https://upload.acmicpc.net/6615a226-be25-494b-a5b6-675246a62592/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 120px; float: right;" />In a random digital exponentiation (RDE) cipher, each digit of a number $a$ is raised to a certain power which is determined by a randomly chosen encryption key. The encrypted number is the number that results when each digit is replaced with its power at the corresponding place value.</p>

<p>For instance, for $a = 243$ and an encryption key of <code>7 4 3</code>, the encrypted value $b$ would be $b = 2^7 \times 10^2 + 4^4 \times 10 + 3^3 = 15\,387$.</p>

<p>Given a plaintext value $a$ and an encrypted value $b$, find the encryption key that was used!</p>

### 입력

<p>The input will contain a single test case containing two numbers $a$ and $b$ ($0 \le a \le b \le 2\,147\,483\,647$).</p>

### 출력

<p>Print the encryption key, which is the list of exponents to which each digit in $a$ was raised, separated by spaces, starting from the leftmost digit&#39;s exponent. Each exponent should be a natural number. You are guaranteed that the encryption key exists and is unique.</p>