# [Gold II] Abbreviation - 13989

[문제 링크](https://www.acmicpc.net/problem/13989)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 254, 정답: 136, 맞힌 사람: 61, 정답 비율: 46.565%

### 분류

파싱, 문자열

### 문제 설명

<p>An abbreviation (from Latin brevis, meaning short) is a shortened form of a word or phrase. In this problem you must write an automated tool that replaces a sequence of capitalized words with the corresponding abbreviation that consists of the first upper case letters only, followed by a full definition in parenthesis. See sample input and output.</p>

<p>Let us make some formal definitions. A word in a text is a maximally long sequence of lower and upper case English letters. A capitalized word is a word that consists of an upper case letter followed by one or more lower case letters. For example, &ldquo;Ab&rdquo;, &ldquo;Abc&rdquo;, &ldquo;Abcd&rdquo;, and &ldquo;Abcde&ldquo; are all capitalized words, while &ldquo;ab&rdquo;, &ldquo;A&rdquo;, &ldquo;AB&ldquo;, &ldquo;ABc&ldquo; and &ldquo;AbC&ldquo; are not.</p>

<p>An abbreviatable sequence of words is a sequence of two or more capitalized words that are separated by exactly one space, no line breaks or punctuation are allowed inside it.</p>

<p>An abbreviation of an abbreviatable sequence of words is a sequence of the first (upper case) letters of each word, followed by a single space, an opening parenthesis, the original abbreviatable sequence, and a closing parenthesis.</p>

### 입력

<p>The input file consists of up to 1 000 lines of text with up to 120 characters on each line. Each line consists of spaces, upper and lower case letters, commas or dots. There are no leading or trailing spaces on lines and there are no empty lines. There is at least one line in the input file.</p>

### 출력

<p>Write to the output file the original text with every abbreviatable sequence of words replaced with the corresponding abbreviation.</p>