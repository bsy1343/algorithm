# [Silver I] You You See What? - 27862

[문제 링크](https://www.acmicpc.net/problem/27862)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 105, 정답: 22, 맞힌 사람: 16, 정답 비율: 24.242%

### 분류

자료 구조, 문자열, 스택

### 문제 설명

<p>Forty some odd years ago, email (as we know it today) was sent using a protocol called UUCP (UNIX-toUNIX Copy Program). This required the sender of a mail message to know every machine name along the path to the recipient, and to specify those machine names (or hops) in the recipients UUCP mail address. This type of ancient email address was known as the bang path. The bang path was a list of machine names separated by exclamation points, ending with the recipient&#39;s account name on the last machine. An example of this would be:</p>

<pre style="text-align: center;">
texasam!rice!baylor!csdept!bresearch!bpoucher</pre>

<p>This address told the sender&rsquo;s system to send the mail to the &ldquo;texasam&rdquo; machine. The &ldquo;texasam&rdquo; machine would then send it to the &ldquo;rice&rdquo; machine. &ldquo;rice&rdquo; would send it to the &ldquo;baylor&rdquo; machine. &ldquo;baylor&rdquo; would send it to &ldquo;csdept&rdquo; who would send it to &ldquo;bresearch&rdquo;. When it reached &ldquo;bresearch&rdquo; (the last machine), it would deliver it to user &ldquo;bpoucher&rdquo; on that machine. Any error along the way (unknown machine, machine down, etc) was supposed to send an email back to the sender indicating what the issue was (good luck with that). Bang paths of eight or ten machines were not uncommon back in the day. The onus of the email routing was on the sender since they had to know how to get from their machine to the recipient&#39;s machine using as many hops as necessary to get there. Often, machines communicated with one another using dial-up modems once or twice a day (there was no internet yet), so it could take days before an email was received by the recipient.</p>

<p>While it was common to have several machines on the UUCP network with the same name, it was not permitted to have two machines with the same name talk to a common machine. That is, using the example above, the &ldquo;baylor&rdquo; machine could not directly communicate with two machines named &ldquo;csdept&rdquo; for obvious reasons. Sometimes, inexperienced users would have &ldquo;loops&rdquo; in their bang path:</p>

<pre style="text-align: center;">
texasam!rice!baylor!csdept!baylor!rice!dev!bresearch!bpoucher</pre>

<p>While this would work, it is inefficient (and delays the email) since the &ldquo;rice&rdquo; machine would send the email to &ldquo;baylor&rdquo; who would send it to &ldquo;csdept&rdquo; who would send it back to &ldquo;baylor&rdquo; who would send it to back to &ldquo;rice&rdquo; who would then send it to &ldquo;dev&rdquo;. The steps of sending to &ldquo;csdept!baylor!rice&rdquo; could be left out with the same net effect, and the email would get to the recipient faster. In addition, a machine may forward an email to itself:</p>

<pre style="text-align: center;">
texasam!Rice!rice!rice!rice!rice!bpoucher</pre>

<p>in this case, all but one of the &ldquo;rice&rdquo; hops can be left out: texasam!Rice!bpoucher</p>

<p>For this problem, you will read a bang path, remove any unnecessary hops and output the new, possibly shorter, bang path.</p>

### 입력

<p>The single line of input contains a string which is the valid bang path to process. The string will be at least one character long and no longer than 256 characters. Each component of the bang path (including the user name at the end) will be between 1 and 10 alpha-numeric characters. Components are separated by a single exclamation point (!). Note that machine names and user names are case-insensitive, but case-preserving. If the bang path does not contain any exclamation points, then the single component specifies a user name on the sender&#39;s machine.</p>

### 출력

<p>Output consists of a single line which is a string that represents the possibly shorter bang path of the input string. As shown in sample 2, the case of a machine (baYlor) must be preserved, but it does not matter which one you chose if one or more of the same machine are eliminated.</p>