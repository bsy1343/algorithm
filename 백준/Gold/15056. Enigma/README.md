# [Gold I] Enigma - 15056

[문제 링크](https://www.acmicpc.net/problem/15056)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 52, 맞힌 사람: 45, 정답 비율: 84.906%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The world famous pirate Cornelius &ldquo;Cheesehead&rdquo; Bakker was a renowned astronomer and mathematician. He buried most of his treasury in the Caribbean island of Saint Basil, where Pico Colombo is a well-known geographic reference mark. Cheesehead disappeared when his fleet of three ships was caught in a hurricane in 1617. Perhaps by some kind of premonition, before his fatal excursion he wrote in a letter to one of his nieces in the Netherlands the exact distance to his hidden treasure, from Pico Colombo in the south direction.</p>

<p>Wary that the map would end up in the wrong hands, Cheesehead used his math skills as an insurance against robbers. Instead of writing in the letter the number indicating the distance, he multiplied it by a second number N, and wrote the result D in the letter, together with the value of N and an explanation of the computation he had done. He knew that even if some unwanted person had the letter, he or she would have to know how to divide two numbers, which very few robbers could at that time. Unfortunately, when the letter arrived in Europe, Cheesehead&rsquo;s niece had joined a convent to become a nun and did not even bother to open the letter.</p>

<p>Exactly four centuries afterwards, Maria came into possession of a chest containing the belongings of her ancestor nun. And you can imagine her surprise when she found the letter, still unopened! Maria is planning an excursion to seek for Cheesehead&rsquo;s treasure, but she needs your help. Although the value of N is intact and she can read it, the number D has been partially eaten by moths so that some of its digits are unreadable. The only clue Maria has is that the leftmost digit of D is not zero because Cheesehead said so in the letter to his niece.</p>

<p>Given the partial representation of D and the value of N, you must determine the smallest possible value for D so that it is a multiple of N and does not have leading zeros.</p>

### 입력

<p>The input consists of a single line that contains a non-empty string S of at most 1000 characters and an integer N (1 &le; N &le; 1000). Each character of S is either a decimal digit or the character &ldquo;?&rdquo; (question mark); the leftmost character is not &ldquo;0&rdquo; and at least one character is &ldquo;?&rdquo;.</p>

### 출력

<p>Output a single line with an integer D without leading zeros indicating the smallest multiple of N that has |S| digits and such that the digits in S are coincident with the corresponding digits in D. If there exists no such an integer D, write an &ldquo;*&rdquo; (asterisk) to the output.</p>