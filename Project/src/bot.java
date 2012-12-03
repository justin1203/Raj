import java.util.Scanner;

public class bot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int slowIndex = 0, startIndex = 0, swearIndex = 0, i, popupIndex = 0;
		int swearCount = 0, blankIndex = 0, osIndex = 0, frozenIndex = 0;
		int noiseIndex = 0, overheatIndex = 0, droppedIndex = 0;
		int rebootIndex = 0, bsodIndex = 0, greetIndex = 0;
		int goodIndex = 0, badIndex = 0, yesIndex = 0, noIndex = 0, changeIndex = 0;
		int scandiskIndex = 0, defragIndex = 0, soundIndex = 0, detectIndex = 0, diskIndex = 0;
		String response;

		Swear swr = new Swear();

		Scanner scan = new Scanner(System.in);

		String[] greet = {"hi", "hello", "yo", "hey", "hello"};
		String[] good = {"good", "fine", "great", "awesome", "fantastic"};
		String[] bad = {"bad", "awful", "horrible", "terrible", "crappy"};
		String[] slow = {"slow", "chug", "delayed", "laggy", "lags"};
		String[] start = {" start", " boot", "started", "starting", " starts"};
		String[] swear = {"fuck", "shit", "ass", "dick", "bitch"};
		String[] blank = {"black", "blank", "nothing", "black", "black"};
		String[] os = {"windows", "os", "operating", "system", "software"};
		String[] frozen = {"frozen", "freeze", "stop", "stop", "stop"};
		String[] noise = {"vibration", "noise", "noisy", "pitch", "squeal"};
		String[] change = {"change", "different", "switch", "changed", "switched"};
		String[] overheat = {"heat", "hot", "overheat", "hot", "hot"};
		String[] dropped = {"connection", "drop", "drop", "drop", "drop"};
		String[] reboot = {"reboot", "restart", "reboot", "reboot", "reboot"};
		String[] bsod = {"bsod", "blue", "death", "bsod", "bsod"};
		String[] sound = {"audio", "speaker", "no sound", "speaker", "speaker"};
		String[] yes = {"yes", "yeah", "ok", "yup", "sure"};
		String[] no = {"no", "nope", "nah", "that's ok", "i'm fine"};
		String[] scandisk = {"scan", "disk", "scandisk", "scandisk", "scandisk"};
		String[] defrag = {"defrag", "defrag", "defrag", "defrag", "defrag"};
		String[] detect = {"detected", "detect", "detected", "detected", "detected"};
		String[] disk = {"disk", "disc", "dvd", "cd", "disk"};
		String[] popup = {"popup", " pop", "pop-up", "popup", "popup"};



		System.out.println("Hello.");
		main:
			while(true){
				i = 0;
				response = scan.nextLine();
				while(i < 5){
					greetIndex = response.indexOf(greet[i]);
					swearIndex = response.indexOf(swear[i]);
					i++;
					if (swearIndex >= 0){
						swearCount++;
						if (swr.findSwear(swearIndex, swearCount)) break main;
					}
					else if (greetIndex >= 0) {
						System.out.println("How are you doing today?");
						break main;
					}
					else if (i == 5){
						System.out.println("Sorry, I did not understand what you said.");
						System.out.println("How are you doing today?");
						break main;
					}
				}
			}



		main:
			while(true){
				i = 0;
				response = scan.nextLine();
				while(i < 5){
					goodIndex = response.indexOf(good[i]);
					badIndex = response.indexOf(bad[i]);
					swearIndex = response.indexOf(swear[i]);
					i++;
					if (swearIndex >= 0){
						swearCount++;
						if (swr.findSwear(swearIndex, swearCount)) break main;
					}
					else if (goodIndex >= 0) {
						System.out.println("That's nice to hear.");
						System.out.println("My name is Raj.");
						System.out.println("How can I help you today?");
						break main;
					}
					else if (badIndex >= 0) {
						System.out.println("That's unfortunate.");
						System.out.println("My name is Raj.");
						System.out.println("How can I help you today?");
						break main;
					}
					else if (i == 5) {
						System.out.println("Sorry, I did not understand what you said.");
						System.out.println("My name is Raj.");
						System.out.println("How can I help you today?");
						break main;
					}
				}
			}

			main:
				while(true){
					i = 0;
					response = scan.nextLine();
					sub:
						while(i < 5){
							slowIndex = response.indexOf(slow[i]);
							startIndex = response.indexOf(start[i]);
							swearIndex = response.indexOf(swear[i]);
							blankIndex = response.indexOf(blank[i]);
							osIndex = response.indexOf(os[i]);
							frozenIndex = response.indexOf(frozen[i]);
							noiseIndex = response.indexOf(noise[i]);
							changeIndex = response.indexOf(change[i]);
							overheatIndex = response.indexOf(overheat[i]);
							droppedIndex = response.indexOf(dropped[i]);
							rebootIndex = response.indexOf(reboot[i]);
							bsodIndex = response.indexOf(bsod[i]);
							noIndex = response.indexOf(no[i]);
							yesIndex = response.indexOf(yes[i]);
							soundIndex = response.indexOf(sound[i]);
							detectIndex = response.indexOf(detect[i]);
							diskIndex = response.indexOf(disk[i]);
							popupIndex = response.indexOf(popup[i]);

							i++;

							if (swearIndex >= 0){
								swearCount++;
								if (swr.findSwear(swearIndex, swearCount)) break main;
							}

							if (slowIndex >= 0){
								System.out.println("If your computer is slower than normal," +
										"\nthis may be due to lack of free space on your hard drive. " +
								"\nDo you have at least 1 GB of free space?");
								response = scan.nextLine();
								i=0;
								slowMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
										}
										if (yesIndex >= 0) {
											i=0;
											System.out.println("Maybe your hard drive is corrupted or fragmented." +
													"\nRunning ScanDisk or Defrag will fix the problem." +
											"\nDo you want me to walk you through?");
											response = scan.nextLine();
											while(i < 5) {
												swearIndex = response.indexOf(swear[i]);
												yesIndex = response.indexOf(yes[i]);
												noIndex = response.indexOf(no[i]);
												scandiskIndex = response.indexOf(scandisk[i]);
												defragIndex = response.indexOf(defrag[i]);
												i++;
												if (swearIndex >= 0){
													swearCount++;
													if (swr.findSwear(swearIndex, swearCount)) break main;
												}
												if (scandiskIndex >= 0){
													System.out.println("Right-click your hard drive, Properties, Tools tab, and then click Check Now." +
															"\nThis will restart your computer so make sure to save your work." +
													"\nIs there anything I can help you with?");
													i=0;
													break slowMain;
												}
												else if(defragIndex >= 0){
													System.out.println("Right-click your hard drive, Properties, Tools tab, and then click the Defragment button." +
															"\nThis will defragment your hard drive and increase performance." +
													"\nIs there anything I can help you with?");
													i=0;
													break slowMain;
												}
												else if (yesIndex >= 0){
													System.out.println("To scan your hard drive, right-click your hard drive," +
															"\nProperties, Tools tab, and then click Check Now." +
															"\nTo defragment your hard drive, right-click your hard drive," +
															"\nProperties, Tools tab, and then click the Defragment button." +
													"\nIs there anything I can help you with?");
													i=0;
													response = "";
													break slowMain;
												}
												else if (noIndex >= 0){
													System.out.println("Is there anything I can help you with?");
													i=0;
													break slowMain;
												}
												else if (i == 5) {
													System.out.println("Sorry, I did not understand what you said.");
												}
											}
										}
										else if (noIndex >= 0) {
											System.out.println("Then deleting unnecessary files will fix your problem." +
											"\nDo you have any other problem?");
											break slowMain;
										}
										else if (i == 5)
											System.out.println("Sorry, I did not understand what you said.");									
									}
							}

							else if (startIndex >= 0){
								System.out.println("A computer that has difficulty starting up" +
										"\ncould have something to do with the power supply." +
								"\nIs the computer plugged into the power point properly?");
								response = scan.nextLine();
								i=0;
								startMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
										}
										if (yesIndex >= 0) {
											System.out.println("Please test the power point with another working device to confirm" +
													"\nwhether or not there is adequate power." +
											"\nDid this fix the problem?");
											i=0;
											response = scan.nextLine();
											while(i < 5) {
												swearIndex = response.indexOf(swear[i]);
												yesIndex = response.indexOf(yes[i]);
												noIndex = response.indexOf(no[i]);
												i++;
												if (swearIndex >= 0){
													swearCount++;
													if (swr.findSwear(swearIndex, swearCount)) break main;
												}
												if (yesIndex >= 0){
													System.out.println("Is there anything I can help you with?");
													response = "";
													break startMain;
												}
												else if (noIndex >= 0){
													System.out.println("It seems there is something wrong with your operating system.");
													i=0;
													osIndex = 1;
													response = "windows";
													break startMain;
												}
												else if (i == 5) {
													System.out.println("Sorry, I did not understand what you said.");
												}
											}
										}
										else if (noIndex >= 0) {
											System.out.println("Then reconnecting the power supply should fix it." +
											"\nDo you have any other problem?");
											break startMain;
										}
										else if (i == 5)
											System.out.println("Sorry, I did not understand what you said.");
									}
							}

							else if (blankIndex >= 0){
								System.out.println("If the computer is on but the screen is blank, there may be an issue" +
										"\nwith the connection between the computer and the monitor." +
										"\nIs the monitor plugged into a power point and is the connection between the monitor" +
								"\nand computer hard drive secure?");
								response = scan.nextLine();
								i=0;
								blankMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
										}
										if (yesIndex >= 0) {
											System.out.println("There might be a problem with the video card." +
													"\nCheck to make sure the card is working by testing it with other computers." +
											"\nDid this fix the problem?");
											i=0;
											response = scan.nextLine();
											while(i < 5) {
												swearIndex = response.indexOf(swear[i]);
												yesIndex = response.indexOf(yes[i]);
												noIndex = response.indexOf(no[i]);
												i++;
												if (swearIndex >= 0){
													swearCount++;
													if (swr.findSwear(swearIndex, swearCount)) break main;
												}
												if (yesIndex >= 0){
													System.out.println("Is there anything I can help you with?");
													response = "";
													break blankMain;
												}
												else if (noIndex >= 0){
													System.out.println("It seems there is something wrong with your operating system.");
													i=0;
													osIndex = 1;
													response = "windows";
													break blankMain;
												}
												else if (i == 5) {
													System.out.println("Sorry, I did not understand what you said.");
												}
											}
										}
										else if (noIndex >= 0) {
											System.out.println("Then reconnecting the monitor should fix it." +
											"\nDo you have any other problem?");
											break blankMain;
										}
										else if (i == 5)
											System.out.println("Sorry, I did not understand what you said.");
									}
							}

							else if (osIndex >= 0){
								System.out.println("If there is something wrong with your operating system," +
										"\nthen you may have to reinstall it with the Windows recovery disk." +
								"\nDo you have any other problem?");
							}

							else if (frozenIndex >= 0){
								System.out.println("When you computer freezes, you may have no other option than" +
										"\nto reboot and risk losing any unsaved work." +
										"\nFreezes can be a sign of insufficient ram, registry conflicts," +
										"\ncorrupt or missing files, or spyware." +
								"\nDo you have enough ram?");
								response = scan.nextLine();
								i=0;
								ramMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
										}
										if (yesIndex >= 0) {
											System.out.println("Perhaps your operating system is corrupt." +
													"\nReinstall it with the Windows recovery disk." +
											"\nDid this fix the problem?");
											response = scan.nextLine();
											i=0;
											while(i < 5) {
												swearIndex = response.indexOf(swear[i]);
												yesIndex = response.indexOf(yes[i]);
												noIndex = response.indexOf(no[i]);
												i++;
												if (swearIndex >= 0){
													swearCount++;
													if (swr.findSwear(swearIndex, swearCount)) break main;
												}
												if (yesIndex >= 0) {
													System.out.println("Is there anything I can help you with?");
													response = "";
													break ramMain;
												}
												else if (noIndex >= 0){
													System.out.println("It seems your computer is infected with virus and/or spyware." +
															"\nRunning an anti-virus software should fix the problem." +
													"\nIs there anything I can help you with?");
													response = "";
													break ramMain;
												}
											}
										}
										else if (noIndex >= 0) {
											System.out.println("Then managing your processes or installing additional ram should fix the problem." +
											"\nDo you have any other problem?");
											break ramMain;
										}
										else if (i == 5)
											System.out.println("Sorry, I did not understand what you said.");
									}

							}

							else if (noiseIndex >= 0){
								System.out.println("Strange sound coming from your computer is generally a sign of a noisy fan." +
										"\nPlease clean or replace the fan." +
								"\nAre there still noises coming from your computer?");
								response = scan.nextLine();
								i=0;
								noiseMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
										}
										if (yesIndex >= 0){
											System.out.println("Hard drives often make noise just before they fail, so you may want to back up" +
													"\ninformation just in case, and replace your hard drive." +
											"\nIs there anything I can help you with?");
											response = "";
											break noiseMain;
										}
										else if (noIndex >= 0){
											System.out.println("Is there anything I can help you with?");
											response = "";
											break noiseMain;
										}
										else if (i == 5) {
											System.out.println("Sorry, I did not understand what you said.");
										}
									}
							}

							else if (changeIndex >= 0){
								System.out.println("This is also known as \"hi-jacking\". Spyware has been installed on your computer" +
										"\nvia almost anything. This action has allowed spyware to install a java script" +
										"\ninto your web browser. The spyware then sends a message to your browser to" +
										"\nchange your user settings. For example change your home page to another web page." +
										"\nIt is also a side effect from viruses. Running an anti-virus software should fix the problem." +
								"\nIs there anything I can help you with?");
								response = "";
							}

							else if (overheatIndex >= 0){
								System.out.println("If a computer case lacks a sufficient cooling system, then the computer’s components" +
										"\nmay start to generate excess heat during operation. To avoid your computer burning itself out," +
										"\nturn it off and let it rest if it’s getting hot. Additionally, you can check the fan to make" +
								"\nsure it’s working properly. Is there anything I can help you with?");
								response = "";
							}

							else if (droppedIndex >= 0){
								System.out.println("Dropped Internet connections can be very frustrating. Often the problem is simple and" +
										"\nmay be caused by a bad cable or phone line. Fix the problem by replacing the cable and double check" +
								"\nthe connection between the computer and the modem. Is the problem still present?");
								response = scan.nextLine();
								i=0;
								droppedMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
											else break droppedMain;
										}
										if (yesIndex >= 0){
											System.out.println("If it's not a bad cable, you may have to reinstall the driver for" +
											"\nyour network card. Did this fix the problem?");
											response = scan.nextLine();
											i=0;
											while(i < 5) {
												swearIndex = response.indexOf(swear[i]);
												yesIndex = response.indexOf(yes[i]);
												noIndex = response.indexOf(no[i]);
												i++;
												if (swearIndex >= 0){
													swearCount++;
													if (swr.findSwear(swearIndex, swearCount)) break main;
												}
												if (yesIndex >= 0){
													System.out.println("It seems like your computer is infected with a virus." +
															"\nPlease run an anti-virus program to fix the problem." +
													"\nIs there anything I can help you with?");
													response = "";
													break droppedMain;
												}
												else if (noIndex >= 0){
													System.out.println("Is there anything I can help you with?");
													response = "";
													break droppedMain;
												}
												else if (i == 5) {
													System.out.println("Sorry, I did not understand what you said.");
												}
											}
										}
										else if (noIndex >= 0){
											System.out.println("Is there anything I can help you with?");
											response = "";
											break droppedMain;
										}
										else if (i == 5) {
											System.out.println("Sorry, I did not understand what you said.");
										}
									}
							}

							else if (rebootIndex >= 0){
								System.out.println("This computer problem can be usually attributed to a hardware issue." +
										"\nUsually it's the power supply dying. Please replace the power supply." +
								"\nIs the problem still present?");
								response = scan.nextLine();
								i=0;
								rebootMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
										}
										if (yesIndex >= 0){
											System.out.println("A defective cooling system may cause the computer to automatically switch off.");
											response = "overheat";
											break rebootMain;
										}
										else if (noIndex >= 0){
											System.out.println("Is there anything I can help you with?");
											response = "";
											break rebootMain;
										}
										else if (i == 5) {
											System.out.println("Sorry, I did not understand what you said.");
										}
									}
							}

							else if(bsodIndex >= 0){
								System.out.println("This is a common computer problem. However, this particular issue is" +
										"\na bit more serious. Check that your anti-virus is up to date and run a complete scan." +
								"\nDo you still get a blue screen of death?");
								response = scan.nextLine();
								i=0;
								bsodMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
										}
										if (yesIndex >= 0){
											System.out.println("If you have concluded that your PC is spyware free, but still get a BSoD," +
													"\nyou should update your hardware drivers. The computer cannot communicate with various" +
													"\nhardware components without an up to date driver. When it cannot find a driver," +
											"\nthe CPU locks up. Did updating your drivers fix the problem?");
											response = scan.nextLine();
											i=0;
											while(i < 5) {
												swearIndex = response.indexOf(swear[i]);
												yesIndex = response.indexOf(yes[i]);
												noIndex = response.indexOf(no[i]);
												i++;
												if (swearIndex >= 0){
													swearCount++;
													if (swr.findSwear(swearIndex, swearCount)) break main;
												}
												if (yesIndex >= 0){
													System.out.println("If the problem still persists, increasing your virtual memory can also" +
															"\nhelp to avoid freezes. Virtual Memory will allow to you get more use out of your" +
													"\ncomputer's RAM. Do you want me to walk you through this process?");
													response = scan.nextLine();
													i=0;
													while(i < 5) {
														swearIndex = response.indexOf(swear[i]);
														yesIndex = response.indexOf(yes[i]);
														noIndex = response.indexOf(no[i]);
														i++;
														if (swearIndex >= 0){
															swearCount++;
															if (swr.findSwear(swearIndex, swearCount)) break main;
														}
														if (yesIndex >= 0){
															System.out.println("1. Click Start, right-click My Computer, and then click Properties." +
																	"\n2. In the System Properties dialog box, click the Advanced tab." +
																	"\n3. In the Performance pane, click Settings." +
																	"\n4. In the Performance Options dialog box, click the Advanced tab." +
																	"\n5. In the Virtual memory pane, click Change." +
																	"\n6. Change the Initial size value and the Maximum size value to a higher value, click Set, and then click OK." +
																	"\n7. Click OK to close the Performance Options dialog box, and then click OK to close the System Properties dialog box." +
															"\nThis should fix the problem. Is there anything else I can help you with?");
															response = "";
															break bsodMain;
														}
														else if (noIndex >= 0){
															System.out.println("Is there anything I can help you with?");
															response = "";
															break bsodMain;
														}
														else if (i == 5) {
															System.out.println("Sorry, I did not understand what you said.");
														}
													}
												}
												else if (noIndex >= 0){
													System.out.println("Is there anything I can help you with?");
													response = "";
													break bsodMain;
												}
												else if (i == 5) {
													System.out.println("Sorry, I did not understand what you said.");
												}
											}
										}
										else if (noIndex >= 0){
											System.out.println("Is there anything I can help you with?");
											response = "";
											break bsodMain;
										}
										else if (i == 5) {
											System.out.println("Sorry, I did not understand what you said.");
										}
									}
							}

							else if (soundIndex >= 0){
								System.out.println("If there's no sound coming out of your speakers, there might be" +
										"\nsomething wrong with your hardware. Check that your speakers are" +
								"\nworking with a different computer. Do they work?");
								response = scan.nextLine();
								i=0;
								soundMain:
									while(i < 5) {
										swearIndex = response.indexOf(swear[i]);
										yesIndex = response.indexOf(yes[i]);
										noIndex = response.indexOf(no[i]);
										i++;
										if (swearIndex >= 0){
											swearCount++;
											if (swr.findSwear(swearIndex, swearCount)) break main;
										}
										if (yesIndex >= 0){
											System.out.println("Please reinstall your sound card drivers." +
											"\nDid this fix the problem?");
											response = scan.nextLine();
											i=0;
											while(i < 5) {
												swearIndex = response.indexOf(swear[i]);
												yesIndex = response.indexOf(yes[i]);
												noIndex = response.indexOf(no[i]);
												i++;
												if (swearIndex >= 0){
													swearCount++;
													if (swr.findSwear(swearIndex, swearCount)) break main;
												}
												if (yesIndex >= 0){
													System.out.println("Is there anything I can help you with?");
													response = "";
													break soundMain;
												}
												else if (noIndex >= 0){
													System.out.println("Please set your desired device as the default sound output." +
															"\nTo do this, go to the Control Panel, Sound, then right-click on the" +
															"\ndesired device and set as default. This should fix the problem." +
													"\nIs there anything I can help you with?");
													response = "";
													break soundMain;
												}
												else if (i == 5) {
													System.out.println("Sorry, I did not understand what you said.");
												}
											}
										}
										else if (noIndex >= 0){
											System.out.println("Then replacing your speakers should fix the problem." +
											"\nIs there anything I can help you with?");
											response = "";
											break soundMain;
										}
										else if (i == 5) {
											System.out.println("Sorry, I did not understand what you said.");
										}
									}
							}

							else if (detectIndex >= 0){
								System.out.println("If your device is not detected, reinstalling the drivers should fix the problem." +
								"\nIs there anything else I can help you with?");
							}

							else if (diskIndex >= 0){
								System.out.println("If your driver can't read your disks, you have to reinstall the drivers." +
								"\nIs there anything else I can help you with?");
							}

							else if (popupIndex >= 0){
								System.out.println("If you constantly encounter pop-ups while using the Internet," +
										"\nit is due to your computer being infected with virus and/or spyware." +
										"\nPlease download the latest anti-virus software and run a complete scan." +
								"\nIs there anything else I can help you with?");
							}

							else if (noIndex >= 0) {
										System.out.println("If you encounter any other problems in the future," +
												"\nplease feel free to call us again." +
										"\nThank you. [Call Disconnected]");
										break main;
							}

							else if (yesIndex >= 0){
								System.out.println("What seems to be the problem?");
								break sub;
							}

							else if (i == 5){}
						}
				}
	}
}
