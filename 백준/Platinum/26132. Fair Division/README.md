# [Platinum V] Fair Division - 26132

[문제 링크](https://www.acmicpc.net/problem/26132)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 222, 정답: 58, 맞힌 사람: 42, 정답 비율: 27.451%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>After sailing the Seven Seas and raiding many ships, Cap&rsquo;n Red and his crew of fellow pirates are finally ready to divide their loot. According to ancient traditions, the crew stands in a circle ordered by a strict pirate hierarchy. Cap&rsquo;n Red starts by taking a fraction f of the loot and passing the remainder on to the next pirate. That pirate takes the same fraction f of the loot left over by the previous pirate and passes the remainder on to the following pirate. Each pirate behaves in the same way, taking a fraction f of what is left and passing on the rest. The last pirate in the hierarchy passes the remainder on to Cap&rsquo;n Red, who starts another round of this &ldquo;fair&rdquo; division, and so on, indefinitely.</p>

<p>Fortunately, pirates in the 21st century can use a computer to avoid this lengthy process and constant nitpicking when the fraction f does not exactly divide the loot at some step. You have been captured by the pirates and asked to come up with a suitable fraction f. As an incentive, Cap&rsquo;n Red has promised to leave you alive if you succeed.</p>

<p>The fraction f needs to be a rational number strictly between <code>0</code> and <code>1</code>. It is not necessary that f exactly divides the loot remaining at any step of the round-robin process described above. However, the total loot that would be assigned to each pirate by carrying out this process infinitely needs to be an integer.</p>

### 입력

<p>The input contains one line with two integers n and m, where n (6 &le; n &le; 10<sup>6</sup>) is the number of pirates including Cap&rsquo;n Red and m (1 &le; m &le; 10<sup>18</sup>) is the total value of their loot.</p>

### 출력

<p>Output one line with two positive integers p and q, where f = p/q as specified above. If there are multiple suitable fractions, choose one with the smallest q. Among multiple suitable fractions with the same smallest q choose the one with the smallest p. If there is no suitable fraction, output <code>impossible</code> instead and hope for mercy</p>