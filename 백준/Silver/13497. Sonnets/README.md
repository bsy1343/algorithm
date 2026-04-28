# [Silver V] Sonnets - 13497

[문제 링크](https://www.acmicpc.net/problem/13497)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 26, 맞힌 사람: 25, 정답 비율: 46.296%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Shakespeare wrote over 100 sonnets. You probably had to read/analyze/memorize &ldquo;Shall I compare thee to a summer&rsquo;s&nbsp;day&rdquo; in school, and might have heard &ldquo;Let not me to the marriage of two minds&rdquo; at weddings, among others. What&nbsp;distinguishes a sonnet from other poems is its rhyme structure and meter. For instance, sonnets are typically in iambic&nbsp;pentameter, and Shakespeare&rsquo;s sonnets are associated with the rhyme scheme &ldquo;ABAB CDCD EFEF GG&rdquo;. This means&nbsp;that the first line rhymes with the third, the second with the fourth, the fifth with the seventh, etc. We will ignore the&nbsp;meter for this problem, and just focus on the rhyme scheme.</p>

<p>You will be given poems to analyze. To save you a lot of work, we will already give you the syllable and stress structure:&nbsp;syllables will be separated by hyphens (which will not be used otherwise), and stressed syllables will be in all-caps, while&nbsp;others will be all lowercase (even if this means starting a sentence with a lowercase letter). Since pronunciation of English&nbsp;is not easy to infer from the writing, we simplify rhyming as follows. In each line, we look at the last stressed syllable and&nbsp;all (0 or more) subsequent unstressed syllables. Then look at the sequence of all vowels (&lsquo;a&rsquo;, &lsquo;e&rsquo;, &lsquo;i&rsquo;, &lsquo;o&rsquo;, &lsquo;u&rsquo;, &lsquo;y&rsquo;) in those&nbsp;syllables combined. Two lines rhyme if that sequence is the exact same for both of them. The first line will be denoted&nbsp;by A, as will all lines that rhyme with it. The first line that doesn&rsquo;t rhyme with it will be B, as will all lines rhyming with&nbsp;it, and so on. An empty line translates to a space in the rhyme scheme.</p>

### 입력

<p>The first line is the number K of input data sets, followed by K data sets, each of the following form:</p>

<p>The first line contains an integers 1 &le; n &le; 26, the number of lines in the poem. This is followed by n lines of text,&nbsp;consisting of upper- and lowercase letters (as discussed above), hyphens (separating syllables), spaces (separating words,&nbsp;and thus also syllables), and the punctuation marks &lsquo;.&rsquo;, &lsquo;,&rsquo;, &lsquo;:&rsquo;, &lsquo;;&rsquo;, which also separate words. Each syllable will be at most&nbsp;6 characters long, and each line at most 100 characters. Each non-empty line will have at least one stressed syllable.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on a line by itself, output the&nbsp;rhyme scheme.</p>

<p>Each data set should be followed by a blank line.</p>