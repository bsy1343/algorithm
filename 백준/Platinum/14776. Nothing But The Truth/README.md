# [Platinum V] Nothing But The Truth - 14776

[문제 링크](https://www.acmicpc.net/problem/14776)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 2, 맞힌 사람: 1, 정답 비율: 33.333%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>When you are presented with a &ldquo;news&rdquo; story, it can be hard to tell whether it is true or fake, in particular if it has been designed to sound &ldquo;believable&rdquo; to you or someone with your biases. However, sometimes, you get lucky and know facts that contradict the story. Here, you will be given several facts about the whereabouts of several people at different times, and then a text that makes claims about where these people were and whom they met. You are supposed to count how many definitely false statements you can find in the text based on the knowledge we provided you.</p>

<p>The background knowledge we give you will be of the form that person X was at place Y from time t<sub>1</sub> until time t<sub>2</sub>, for different persons, places, and times. (The same person, place, or time may of course appear multiple times; but we will never claim that a person was in two places at the same time.) When there is a time at which we didn&rsquo;t tell you where a person was, that person could have been anywhere. (It&rsquo;s something you don&rsquo;t know.)</p>

<p>The text will make claims about who met whom and who was where when. (It will also make many other claims, but you will ignore those.) Text consists of letters (upper case and lower case), spaces (including tabs and newlines), periods, and commas. Commas and all kinds of spaces separate words. Periods separate sentences. To simplify your parsing task (natural language is hard to parse), we follow the following rules:</p>

<ul>
	<li>When the sentence contains the word &ldquo;met&rdquo;, then all people whose names are in the sentence are claimed to have met each other, though not necessarily at the same time or in the same place. For instance, the sentence &ldquo;Flynn, Trump and Putin met.&rdquo; claims that the pair (Flynn, Trump) met at some point, (Flynn, Putin) met at some (possibly different) point, and (Trump, Putin) met at some point.</li>
	<li>Any sentence that contains the phrase &ldquo;was at&rdquo; makes a claim about a location of a person at some time. The next word after this &ldquo;at&rdquo; is the claimed location. A sentence containing the phrase &ldquo;was at&rdquo; applies to any person whose name occurs in the sentence. The time period that is claimed is given by two phrases denoted with &ldquo;from&rdquo; and &ldquo;until&rdquo;. Each is followed by an integer (between 0 and 10000) which is the claimed time. We will guarantee that the &ldquo;from&rdquo; integer is never larger than the &ldquo;until&rdquo; integer. So &ldquo;Until 50 Bernie was at Philadelphia Hillary from 30.&rdquo; claims that Bernie and Hillary were both at Philadelphia from time 30 until time 50 (inclusive).</li>
	<li>No sentence contains both a &ldquo;met&rdquo; and a &ldquo;was at&rdquo;. No sentence contains more than one &ldquo;was at&rdquo;. Each sentence with a &ldquo;was at&rdquo; contains exactly one &ldquo;from&rdquo; and exactly one &ldquo;until&rdquo;.</li>
	<li>Case does not matter, so &ldquo;Jill&rdquo; and &ldquo;jiLl&rdquo; are the same person, and &ldquo;met&rdquo; and &ldquo;mET&rdquo; mean the same.</li>
	<li>No two people or places will have the same name, and no person and place will have the same name. No person or place will be named &ldquo;met&rdquo;, &ldquo;from&rdquo;, or any other word that carries special meaning for this problem.</li>
</ul>

<p>The creators of the fake news story know enough to avoid internal contradictions (like claiming that Bernie was at Philadelphia from 30&ndash;50 and at Vermont from 20&ndash;30), so you don&rsquo;t need to look for them. Instead, you are supposed to count the false statements implied by the text. In the examples above, if Flynn met Trump, but neither Flynn nor Trump met Putin, that would be two false statements. If neither Bernie nor Hillary was at Philadelphia for the entire interval 30&ndash;50 (maybe Hillary was there from 30&ndash;45 and Bernie from 40&ndash;50), then that would also be two false statements.</p>

<p>We consider a claim that X met Y to be true if based on our background knowledge, the two were in the same place at the same time at least once. (For instance, if Flynn was at MarALago from 10 to 20 and Trump was at MarALago from 20 to 22, then they met.) If we have no such evidence, we consider the statement false. On the other hand, we consider a &ldquo;was at&rdquo; statement false only if we have evidence that the person was somewhere else for at least one time unit in the interval.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains four integers p, ℓ, m, n. 1 &le; p &le; 20 is the number of people, 1 &le; ℓ &le; 20 is the number of locations. 0 &le; m &le; 1000 is the number of facts you are given, and 0 &le; n &le; 30 is the number of lines of the news story.</p>

<p>This is followed by a single line with the names of the p people, each a string of 1&ndash;16 letters, separated by spaces and/or tabs. (Names have no spaces in them.) Next is a single line with the names of the ℓ locations, each also a string of 1&ndash;16 letters, separated by spaces and/or tabs.</p>

<p>After that are m lines, each stating a fact i by giving four integers p<sub>i</sub>, ℓ<sub>i</sub>, s<sub>i</sub>, f<sub>i</sub>. Here 1 &le; p<sub>i</sub> &le; p is the person, 1 &le; ℓ<sub>i</sub> &le; ℓ is the location, and 0 &le; s<sub>i</sub> &le; f<sub>i</sub> &le; 10000 is the time interval when person p<sub>i</sub> was at ℓ<sub>i</sub>. (From s<sub>i</sub> until f<sub>i</sub>, inclusive.)</p>

<p>Finally, there are n lines of text, as described above. Each line is at most 120 characters long.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on a line by itself, output the number of false statements made in the text.</p>

<p>Each data set should be followed by a blank line.</p>