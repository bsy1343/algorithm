# [Platinum III] Free Willy - 11106

[문제 링크](https://www.acmicpc.net/problem/11106)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 47, 정답: 16, 맞힌 사람: 11, 정답 비율: 40.741%

### 분류

양방향 탐색, 자료 구조, 그래프 이론, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Willy is sitting behind bars in Alcatraz. Jan Erik Vold is guarding him, and gives him a challenge:</p>

<p>&rdquo;I managed to transform KULTURUKE into UKTURKULE by applying these permutations in succession: bcdefaghi cabfdeghi bcadefghi adcefgbhi cgabdefhi cdaefhgbi</p>

<p>That&rsquo;s what gave me the start of my great poem: KULTURUKE ULTURKUKE TULKURUKE ULTKURUKE UKTURULKE TLUKURUKE UKTURKULE</p>

<p>Now, I want you to do the transformation using the same set of available permutations. I permuted 6 times, but if you can manage to do it by permuting fewer times than I did, then I&rsquo;ll unlock the cage!&rdquo;</p>

<p>&rdquo;That&rsquo;s easy, I only need 4 permutations!&rdquo; says Willy &rdquo;You first apply bcadefghi to get ULKTURUKE. Then cdaefhgbi to get KTUURKULE. Then bcadefghi again to get TUKURKULE. And finally bcadefghi a third time to get UKTURKULE.&rdquo;</p>

<p>&rdquo;Oh, you&rsquo;re not a big, dumb fish after all&rdquo; says Jan Erik and brings out the keys. Willy jumps into the ocean and lives happily ever after!</p>

### 입력

<p>The first line of the input gives the number of test cases T &le; 30. The first line of each test case contains 1 &le; N &le; 26, 1 &le; P &le; 10, and 1 &le; L &le; 10. The second line contains two words with N characters each. Then follow P lines, each with an allowed permutation of the first N letters of the alphabet (in lowercase).</p>

### 출력

<p>For each test case, output one line with the minimum number of times you need to apply one of the allowed permutations to the letters of the first word in order to arrive at the second word, or &ldquo;whalemeat&rdquo; if it&rsquo;s not possible to do it in at most L steps.</p>