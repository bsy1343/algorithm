# [Silver IV] The Alphabet Sticker - 9631

[문제 링크](https://www.acmicpc.net/problem/9631)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 197, 정답: 97, 맞힌 사람: 85, 정답 비율: 48.851%

### 분류

수학, 문자열, 조합론

### 문제 설명

<p>When we were kids, we used to play with some stickers where these stickers contain some (but not necessarily all) lower case English alphabet letters.</p>

<p>Each sticker contains some letters arranged in a single row, where all occurrences of the same letter are adjacent to each other. A sticker can be represented as a string of characters, for example the following are valid stickers&rsquo; representations: &ldquo;aabcc&rdquo;, &ldquo;ccccab&rdquo; and &ldquo;mmaw&rdquo;. And the following are not valid (because not all occurrences of the same letter are adjacent to each other): &ldquo;abacc&rdquo;, &ldquo;cccabc&rdquo; and &ldquo;mawm&rdquo;.</p>

<p>Now we found some stickers with some missing letters, but we are sure that all missing letters belong to the visible letters set (that is, for every missing letter, there is at least one visible letter that matches the missing one). In this problem a question mark letter represents a missing letter. Given some stickers&rsquo; representations with zero or more missing letters, your task is to count the number of possible original configurations for each sticker.</p>

<p>For example, this sticker &ldquo;aa??bb&rdquo; with missing letters could have been one of the following original stickers &ldquo;aaaabb&rdquo;, &ldquo;aaabbb&rdquo; or &ldquo;aabbbb&rdquo;. But it could not have been any of the following original stickers &ldquo;aababb&rdquo; (it is invalid sticker) and &ldquo;aaccbb&rdquo; (because the letter &lsquo;c&rsquo; did not appear in the given configuration).</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100). Followed by the test cases, each test case is described in one line which contains a non-empty string which consists of up to 10,000 letters, each letter is either a lower case English letter (from &lsquo;a&rsquo; to &lsquo;z&rsquo;) or a question mark (&lsquo;?&rsquo;). This string represents a sticker configuration which contains zero or more question marks, it will also contain at least one letter which is not a question mark and there will be at least one valid original configuration for it.</p>

### 출력

<p>For each test case, print a single line which contains a single integer representing the number of possible original configurations for the sticker, since the result may be very large, print it modulo 1,000,000,007 (10<sup>9</sup> + 7).</p>