# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "ubuntu-saucy"

  config.vm.hostname = "chat-servers.local"
  config.vm.network :private_network, ip: "192.168.33.10"
  config.vm.synced_folder ".", "/vagrant_data", type: "nfs"

  config.vm.provision :puppet do |puppet|
    puppet.manifests_path = "provisioning"
    puppet.module_path = ["provisioning/modules"]
    puppet.manifest_file  = "development.pp"
  end
end
