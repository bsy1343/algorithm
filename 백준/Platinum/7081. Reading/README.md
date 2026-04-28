# [Platinum I] Reading - 7081

[문제 링크](https://www.acmicpc.net/problem/7081)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 159, 정답: 106, 맞힌 사람: 89, 정답 비율: 68.462%

### 분류

벌리캠프–매시, 다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학, 누적 합

### 문제 설명

<p>Interesting fact about the human brain is that, when reading, it analyses the first and last letter of each word, taking all other not necessarily in the right order to construct the meaning. As a conesqunece, a senetnce whit amlost no corerct word can be raed easliy. ☺</p>

<p>Elly has noticed that shuffling certain letters gives even better result! For example the characters &ldquo;l&rdquo; and &ldquo;i&rdquo;, &ldquo;a&rdquo; and &ldquo;o&rdquo; are much similar, than, let&rsquo;s say, &ldquo;x&rdquo; and &ldquo;m&rdquo;. She defines a scale from 1 to 5 of difference between letters, where similar ones have low value, and very different have high value. Equal letters have a value of one. In this manner each word can be given a value &ndash; the sum of all differences between adjacent letters.</p>

<p>Imagine she has defined the differences between &ldquo;e&rdquo; and &ldquo;l&rdquo; as 3, between &ldquo;l&rdquo; and &ldquo;y&rdquo; as 2, between &ldquo;i&rdquo; and &ldquo;l&rdquo; as 1. Then the word &ldquo;elly&rdquo; has value of 3 + 1 + 2 = 6 (remember, that equal letters have distance of 1). The word &ldquo;lily&rdquo; has value of 4 and &ldquo;i&rdquo; have value of zero =). Longer words are not necessarily with larger value than shorted &ndash; consider &ldquo;lilii&rdquo; (which is the Bulgarian plural of &ldquo;lily&rdquo;) &ndash; it has value of only 4, but &ldquo;elle&rdquo; (which means &ldquo;she&rdquo; in French) has a value of 7. However, each additional letter adds at least one to the value of the word.</p>

<p>Elleonora wants to construct a language that would be easily readable even with huge number of misplaced letters. She has decided to include all non-empty words with values less than or equal to N. Can you help her by finding how many are they?&nbsp;</p>

### 입력

<p>On the first line of the standard input are given the integers N and M &ndash; the maximal value of a word (1 &le; N &le; 1,000,000,000) and the number of character pairs, for which Elly has defined a difference. All not mentioned pairs have distance equal to one. Each of the next M lines contains a triple L1 L2 F, meaning that the distance between letters а &le; L1, L2 &le; z is 1 &le; F &le; 5. The distance from L1 to L2 is the same as the distance from L2 to L1.&nbsp;</p>

### 출력

<p>Print one sole integer on the standard output&ndash; the number of words, consisting of lowercase English letters, whose value is not greater than N. Since this number can be quite large, output the reminder of the number when divided by 1,000,000,007.&nbsp;</p>

### 힌트

<p>Trivia: some of the words are: &rdquo;elleonora&rdquo;, &rdquo;entwine&rdquo;, &rdquo;aaaaaaaaaaaaaaaaaaaaa&rdquo;.</p>