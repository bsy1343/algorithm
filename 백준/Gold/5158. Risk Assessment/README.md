# [Gold V] Risk Assessment - 5158

[문제 링크](https://www.acmicpc.net/problem/5158)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

구현, 파싱, 문자열

### 문제 설명

<p>One way in which investors make informed decisions about what companies to put their money in (e.g., by buying stock) is by reading independent assessments. There are several services writing these up, and grading stocks. During the heydays of financial wheeling and dealing, apparently, most companies were judged to be sound investments, even when they had no discernible business model. All that it would take was a sentence like &ldquo;a high-yield prospect&rdquo;, and investors would follow like lemmings. In fact, a computer program could probably do the same. And guess what: you get to write that program.</p>

<p>Your program will get a piece of text about one or more companies. There are certain quality words with positive or negative connotations. For instance &ldquo;trouble&rdquo; is negative, and &ldquo;promising&rdquo; is positive. For each such word, we will have a basic quality score. However, sentences can also contain the modifiers &ldquo;not&rdquo;, &ldquo;very&rdquo;, &ldquo;extremely&rdquo; and &ldquo;slightly&rdquo;. If the word &ldquo;not&rdquo; appears in a sentence, it changes the value of all quality words in that sentence to 0. &ldquo;Very&rdquo; doubles the value of each quality word in its sentence, &ldquo;extremely&rdquo; triples the value of each quality word, and &ldquo;slightly&rdquo; halves the value. These multipliers accumulate multiplicatively: for instance, the sentence &ldquo;AIG very trouble extremely very.&rdquo; assigns &ldquo;AIG&rdquo; a score of -12 (assuming &ldquo;trouble&rdquo; has a score of -1). Modifiers apply only within a sentence; a sentence is defined as ending with a &lsquo;.&rsquo; (our texts will not contain &lsquo;,&rsquo;, &lsquo;;&rsquo;, or &lsquo;:&rsquo; or other punctuation).</p>

<p>A piece of text can be about multiple companies. The way we find out what quality words apply to what company is as follows: from the moment in the text at which a company name appears until the next name of a company (or the end of the text), we assume that all words refer to that company. All words before the first company name talk about no company. Notice that multiple companies can be in the same sentence. For instance &ldquo;AIG trouble Pixar promising very.&rdquo; assigns a score of -2 to &ldquo;AIG&rdquo; and +2 to &ldquo;Pixar&rdquo; (assuming &ldquo;trouble&rdquo; counts for -1 and &ldquo;promising&rdquo; for +1), because &ldquo;very&rdquo; applies to both &ldquo;trouble&rdquo; and &ldquo;promising&rdquo; (being in the same sentence with both).</p>

<p>If a company appears in multiple sentences (or multiple blocks), the scores from those sentences are added.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains three integers C,Q,L. 1 &le; C &le; 100 is the number of companies, 1 &le; Q &le; 100 the number of quality words, and 1 &le; L &le; 1000 the number of lines of text. This is followed by C lines, each containing the name of a company (consisting of letters and possibly hyphens). Next come Q lines. Each of these lines contains first a quality word w<sub>i</sub> (also possibly containing hyphens), then a space, and then a floating point number q<sub>i</sub>, the quality score of word i.</p>

<p>Finally, there are L lines of text. Each line has at most 80 characters. All characters are either upper or lower case characters, hyphens (which are part of words), &lsquo;.&rsquo; or space. Company names only match if the case is correct, i.e., &ldquo;AIG&rdquo; does not match &ldquo;aig&rdquo;. However, quality words or modifiers match irrespective of case, e.g, &ldquo;trouble&rdquo; matches &ldquo;tRoubLE&rdquo; and &ldquo;Very&rdquo; matches &ldquo;veRY&rdquo;. Our input will ensure that no two quality words are the same, and no company name is the same as any other company name or quality word.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the quality scores for all C companies (rounded to two decimals), one per line. They should be in the same order as the company names were given in the input. Each data set should be followed by an empty line.</p>