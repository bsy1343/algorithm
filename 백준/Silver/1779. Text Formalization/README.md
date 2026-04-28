# [Silver I] Text Formalization - 1779

[문제 링크](https://www.acmicpc.net/problem/1779)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 440, 정답: 46, 맞힌 사람: 23, 정답 비율: 8.812%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>One duty Jimmy has at the ACM is to formalize the language and grammar used in texts. Part of this job is expanding contractions and certain acronyms.</p>

<p>A contraction in English is a word or phrase formed by omitting or combining some of the sounds of a longer phrase. For example, &quot;don&#39;t&quot; is a contraction for &quot;do not&quot; and &quot;o&#39;clock&quot; comes from &quot;of the clock.&quot;</p>

<p>An acronym is a series of letters (or word) formed from the initial letters of a name or from combining parts of a series of words. For example, &quot;ACM&quot; for &quot;Association for Computing Machinery&quot; or &quot;radar&quot; for &quot;radio detecting and ranging.&quot;</p>

<p>Your job is to take a list of contractions and acronyms, and expand all contractions and some acronyms in a text.</p>

### 입력

<p>Input begins with two numbers,&nbsp;<em>C</em>&nbsp;&lt;&nbsp;50 and&nbsp;<em>A</em>&nbsp;&lt;&nbsp;50, indicating respectively the number of contractions and acronyms Jimmy must expand. The next&nbsp;<em>C</em>&nbsp;lines list a contraction and its formal expansion. Following will be a list of&nbsp;<em>A</em>&nbsp;acronyms and their expansions, each on individual lines. Both contractions and acronyms will be presented in the following format:</p>

<pre>
 &quot;contraction or acronym&quot; -&gt; &quot;expansion&quot;
</pre>

<p>Since contractions, acronyms and expansions may contain spaces, each will be enclosed in quotation marks and be no more than 80 characters in length. Following the lists of contractions and acronyms will be a series of texts to expand. Each text will consist of lines no longer than 80 characters. No contraction or acronym will be split over multiple lines. A text will be terminated with a line consisting only of the character &#39;#&#39;.</p>

### 출력

<p>Output each text exactly as input, except for necessary expansions.</p>

<p>All contractions must be fully expanded. Each contraction may appear as listed, entirely uppercase, or capitalized (first letter uppercase, remaining letters as listed). The expansion should follow the same rule; if a contraction is uppercased, the expansion should be uppercased as well. If more than one case applies, choose the earliest matching case in the list: &quot;as listed,&quot; &quot;uppercased,&quot; and &quot;capitalized.&quot;</p>

<p>Since acronyms are useful for understanding and identifying names, only modify the first instance of an acronym in each text. An instance of an acronym must match the case exactly (&quot;acm&quot; is not an instance of &quot;ACM&quot;). The modification consists of replacing the acronym with the expansion, followed by a space, followed by the acronym in brackets. This allows the reader to connect the acronym with the fully expanded term.</p>

<p>The terminating line of &#39;#&#39; should be printed after each text. If more than one expansion or acronym match can be valid, use the one which starts earlier in the text. If several begin at the same letter, use the one appearing earliest in the input lists. Use the sample below to illustrate the process.</p>