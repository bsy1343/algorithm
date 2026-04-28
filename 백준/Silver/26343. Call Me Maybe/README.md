# [Silver I] Call Me Maybe - 26343

[문제 링크](https://www.acmicpc.net/problem/26343)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 9, 맞힌 사람: 9, 정답 비율: 42.857%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>The popular song, &ldquo;Call Me Maybe&rdquo; by Carly Rae Jepson, has been spoofed with great comedic success on the internet recently. In particular, one of the YouTube videos splices words from different speeches by President Obama to string together the lyrics of the song. (Rumor has it that Angela Merkel is eagerly awaiting Mr. Obama&rsquo;s call.) You have decided that this idea is comic gold. Given a library of a particular person&rsquo;s speeches as well as the lyrics to a song, you want to spoof them by writing a program to automatically check the text of all of the speeches to make the appropriate word substitutions from the speeches to the song lyrics. For example, the first line of &ldquo;Call Me Maybe&rdquo; is &ldquo;I threw a wish in the well.&rdquo; Perhaps &ldquo;I&rdquo; appears as the 10th word in speech number 4, &ldquo;threw&rdquo; appears as the 54th word in speech number 12, etc. Of course, if the speaker never said &ldquo;wish&rdquo; in any of his speeches, then the spoof is not possible. With your program, you can spoof almost any song with any celebrity and get rich!</p>

<p>Given a list of speeches by an individual, as well as the text of a song to spoof by pulling words from those speeches, determine if the spoof is possible and, if so, give a listing of which words in which speeches to use as substitutes.</p>

<p>In order to obtain a unique answer, you must cycle through each occurrence of a particular word in the set of speeches, in order by speech and word. Thus, if the word, &ldquo;I&rdquo; appears five times in the song and appears in the following four locations: (1) speech 2, word 7, (2) speech 4, word 12, (3) speech 4, word 50, and (4) speech 5, word 1, then the first substitution would come from speech 2, the second substitution would be the 12th word of speech 4, the third substitution would be the 50th word of speech 4, the fourth substitution would be from speech 5 and the last substitution would be from speech 2 again. As this example illustrates, a word does not have to appear in speeches as many times as it appears in a song. It does, however, have to appear at least once. Note also that a word may appear several times in a speech and these occurrences are used in order and before using the first occurrence of that word in the next speech.</p>

### 입력

<p>The first input line contains a single integer, n (1 &le; n &le; 20), indicating the number of spoofs to potentially create. Each of the n input sets follows. The first line of each input set contains an integer, m (1 &le; m &le; 100), representing the number of speeches for which there is text. Each of the speeches follows. Each speech is stored on a single line. The first token on each of these lines will be an integer, t (1 &le; t &le; 1000), representing the number of words in the speech. Each of these words will consist of 1-20 lowercase letters. Words are separated by spaces and there are no other characters on these lines.</p>

<p>The input speeches are followed by a single line storing the lyrics of the song to be spoofed. The first token of this line will be an integer, l (1 &le; l &le; 50), indicating the number of words in the lyrics. (Most songs aren&rsquo;t so long!) Each of these words will consist of 1-20 lowercase letters. The words in the lyrics are separated by spaces and there are no other characters on this line.</p>

### 출력

<p>For each spoof, first output &ldquo;Spoof #i: &rdquo; where i is the spoof number, starting with 1. If no spoof is possible, then simply output the string &ldquo;NOT POSSIBLE&rdquo;.</p>

<p>If a spoof is possible, starting on the next line, output w lines, where w is the number of words in the song to spoof. Each line will contain two integers (separated by one space): the speech number and the word number, both of which are numbered, starting at 1.</p>

<p>Leave a blank line after the output for each test case. Follow the format illustrated in Sample Output.</p>