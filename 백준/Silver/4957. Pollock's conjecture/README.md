# [Silver I] Pollock's conjecture - 4957

[문제 링크](https://www.acmicpc.net/problem/4957)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 73, 정답: 37, 맞힌 사람: 28, 정답 비율: 65.116%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>The nth triangular number is defined as the sum of the first n positive integers. The nth tetrahedral number is defined as the sum of the first n triangular numbers. It is easy to show that the nth tetrahedral number is equal to n(n+1)(n+2) &frasl; 6. For example, the 5th tetrahedral number is 1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5) = 5&times;6&times;7 &frasl; 6 = 35.</p>

<p>The first 5 triangular numbers: 1, 3, 6, 10, 15</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/1f5abb27.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/2afb8719.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/71d39a45.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/05ed693c.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/e7d3db3e.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/f2f92dd7.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/08b24c82.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/d5f55742.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/b9cfdb0c.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/140b2856.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /></p>

<p>The first 5 tetrahedral numbers: 1, 4, 10, 20, 35</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/cb375479.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/3c3332e8.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/0dbec2be.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/1457db21.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-7.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/94f92bc4.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/6fa43444.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-8.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/40eab95f.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/f9fa3471.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-9.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/e77670c0.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4957.%E2%80%85Pollock's%E2%80%85conjecture/aa5fa3b6.png" data-original-src="https://boja.mercury.kr/assets/problem/4957-10.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:108px; width:108px" /></p>

<p>In 1850, Sir Frederick Pollock, 1st Baronet, who was not a professional mathematician but a British lawyer and Tory (currently known as Conservative) politician, conjectured that every positive integer can be represented as the sum of at most five tetrahedral numbers. Here, a tetrahedral number may occur in the sum more than once and, in such a case, each occurrence is counted separately. The conjecture has been open for more than one and a half century.</p>

<p>Your mission is to write a program to verify Pollock&#39;s conjecture for individual integers. Your program should make a calculation of the least number of tetrahedral numbers to represent each input integer as their sum. In addition, for some unknown reason, your program should make a similar calculation with only odd tetrahedral numbers available.</p>

<p>For example, one can represent 40 as the sum of 2 tetrahedral numbers, 4&times;5&times;6 &frasl; 6 + 4&times;5&times;6 &frasl; 6, but 40 itself is not a tetrahedral number. One can represent 40 as the sum of 6 odd tetrahedral numbers, 5&times;6&times;7 &frasl; 6 + 1&times;2&times;3 &frasl; 6 + 1&times;2&times;3 &frasl; 6 + 1&times;2&times;3 &frasl; 6 + 1&times;2&times;3 &frasl; 6 + 1&times;2&times;3 &frasl; 6, but cannot represent as the sum of fewer odd tetrahedral numbers. Thus, your program should report 2 and 6 if 40 is given.</p>

### 입력

<p>The input is a sequence of lines each of which contains a single positive integer less than 106. The end of the input is indicated by a line containing a single zero.</p>

### 출력

<p>For each input positive integer, output a line containing two integers separated by a space. The first integer should be the least number of tetrahedral numbers to represent the input integer as their sum. The second integer should be the least number of odd tetrahedral numbers to represent the input integer as their sum. No extra characters should appear in the output.</p>